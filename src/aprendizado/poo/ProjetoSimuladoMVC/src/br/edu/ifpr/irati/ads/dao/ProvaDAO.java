package aprendizado.poo.ProjetoSimuladoMVC.src.br.edu.ifpr.irati.ads.dao;

import br.edu.ifpr.irati.ads.modelo.Alternativa;
import br.edu.ifpr.irati.ads.modelo.Disciplina;
import br.edu.ifpr.irati.ads.modelo.Prova;
import br.edu.ifpr.irati.ads.modelo.Questao;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class ProvaDAO {

    public Prova carregarProva() {

        Prova p = new Prova();
        Disciplina d1 = new Disciplina(0, "Língua Portuguesa");
        Disciplina d2 = new Disciplina(0, "Matemática");
        p.setId(1);
        p.setAno(2023);
        List<Questao> questoes = new ArrayList<>();
        //adicionar as questões
        Alternativa altq1[] = new Alternativa[4];
        altq1[0] = new Alternativa(1, "No trecho \"Eu acho que ele é uma droga de liberação lenta\" há uma oração subordinada substantiva objetiva direta introduzida pelo termo que\"", 1);
        altq1[1] = new Alternativa(2, "No trecho \"Eu acho que ele é uma droga de liberação lenta\" há uma oração subordinada substantiva objetiva direta introduzida pelo termo que\"", 2);
        altq1[2] = new Alternativa(3, "No trecho \"Eu acho que ele é uma droga de liberação lenta\" há uma oração subordinada substantiva objetiva direta introduzida pelo termo que\"", 4);
        altq1[3] = new Alternativa(4, "No trecho \"Eu acho que ele é uma droga de liberação lenta\" há uma oração subordinada substantiva objetiva direta introduzida pelo termo que\"", 8);
        Questao q1 = new Questao(1, 1,
                d1,
                "",
                "De acordo com as normas da língua portuguesa, assinale o que for correto.",
                "/imagens_questoes/img_q12_2023.png",
                altq1, 5);
        questoes.add(q1);

        Alternativa altq2[] = new Alternativa[4];
        altq2[0] = new Alternativa(1, "Podemos afirmar que a fratura social à qual se refere o professor João Cezar de Castro Rocha está ligada ao fato de a violência ser muitas vezes naturalizada e oculta em nosso país", 1);
        altq2[1] = new Alternativa(1, "Podemos afirmar que a fratura social à qual se refere o professor João Cezar de Castro Rocha está ligada ao fato de a violência ser muitas vezes naturalizada e oculta em nosso país", 2);
        altq2[2] = new Alternativa(1, "Podemos afirmar que a fratura social à qual se refere o professor João Cezar de Castro Rocha está ligada ao fato de a violência ser muitas vezes naturalizada e oculta em nosso país", 4);
        altq2[3] = new Alternativa(1, "Podemos afirmar que a fratura social à qual se refere o professor João Cezar de Castro Rocha está ligada ao fato de a violência ser muitas vezes naturalizada e oculta em nosso país", 8);
        Questao q2 = new Questao(2, 2,
                d2,
                "",
                "Conforme o texto, assinale o que for correto:",
                "",
                altq2, 8);
        questoes.add(q2);
        p.setQuestoes(questoes);
        return p;
    }

    /**
     * Script para cadastrar a prova no banco de dados
     *
     * letra d
     */
    public void cadastrarProva(Prova p) {

        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();

            //salvar a prova
            String sqlProva = "insert into prova (ano) values (?)";
            PreparedStatement ps = con.prepareStatement(sqlProva, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p.getAno());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int idProva = rs.getInt(1);
                p.setId(idProva);
            }

            //descobrir quais são as disciplinas e salvá-las
            String sqlDisciplina = "insert into disciplina (nome) values (?)";
            ps = con.prepareStatement(sqlDisciplina, PreparedStatement.RETURN_GENERATED_KEYS);
            Set<Disciplina> disciplinasSet = new HashSet<>();
            for (Questao q : p.getQuestoes()) {
                disciplinasSet.add(q.getDisciplina());
            }
            for (Disciplina d : disciplinasSet) {
                ps.setString(1, d.getNome());
                ps.execute();
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    int idDisciplina = rs.getInt(1);
                    d.setId(idDisciplina);
                }
            }

            //cadastrar as questões
            String sqlQuestao = "insert into questao "
                    + "(numero, textoIntrodutorio, enunciado, "
                    + "somaGabarito, figura, fkIdProva, fkIdDisciplina) values "
                    + "(?,?,?,?,?,?,?)";

            for (Questao q : p.getQuestoes()) {
                ps = con.prepareStatement(sqlQuestao, PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setInt(1, q.getNumero());
                ps.setString(2, q.getTextoIntrodutorio());
                ps.setString(3, q.getEnunciado());
                ps.setInt(4, q.getSomaGabarito());
                ps.setString(5, q.getFigura());
                ps.setInt(6, p.getId());
                ps.setInt(7, q.getDisciplina().getId());
                ps.execute();
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    int idQuestao = rs.getInt(1);
                    q.setId(idQuestao);
                }

                //para cada questão salva, salvar suas alternativas
                String sqlAlternativa = "insert into alternativa (valor, texto, fkIdQuestao) "
                        + "values (?,?,?)";
                for (Alternativa a : q.getAlternativas()) {
                    ps = con.prepareStatement(sqlAlternativa, PreparedStatement.RETURN_GENERATED_KEYS);
                    ps.setInt(1, a.getValor());
                    ps.setString(2, a.getTexto());
                    ps.setInt(3, q.getId());
                    ps.execute();
                    rs = ps.getGeneratedKeys();
                    if (rs.next()) {
                        int idAlternativa = rs.getInt(1);
                        a.setId(idAlternativa);
                    }
                }
            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public Prova buscarProvaPorAno(int ano){
        
        Prova p = new Prova();
        try {
            String sql = "select p.id as idProva, "
                    + "p.ano as anoProva, "
                    + "q.id as idQuestao, "
                    + "textoIntrodutorio as textoIntrodutorioQuestao, "
                    + "enunciado as enunciadoQuestao, "
                    + "somaGabarito as somaGabaritoQuestao, "
                    + "figura as figuraQuestao, "
                    + "numero as numeroQuestao, "
                    + "a.id as idAlternativa, "
                    + "valor as valorAlternativa, "
                    + "texto as textoAlternativa, "
                    + "d.id as idDisciplina, "
                    + "d.nome as nomeDisciplina "
                    + "from prova p "
                    + "inner join questao q "
                    + "on p.id = q.fkIdProva "
                    + "inner join alternativa a "
                    + "on q.id = a.fkIdQuestao "
                    + "inner join disciplina d "
                    + "on q.fkIdDisciplina = d.id "
                    + "and p.ano = ?";
            
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ano);
            ResultSet rs = ps.executeQuery();
            int indexAlternativa = 0;
            while (rs.next()){
                int idProva = rs.getInt(1);
                int idQuestao = rs.getInt(3);
                String textoIntrodutorio = rs.getString(4);
                String enunciado = rs.getString(5);
                int somaGabarito = rs.getInt(6);
                String figura = rs.getString(7);
                int numero = rs.getInt(8);
                int idAlternativa = rs.getInt(9);
                int valor = rs.getInt(10);
                String textoAlternativa = rs.getString(11);
                int idDisciplina = rs.getInt(12);
                String nomeDisciplina = rs.getString(13);
                if (p.getId() == 0){
                    p.setId(idProva);
                    p.setAno(ano);
                }
                
                Questao questao = new Questao();
                for (Questao q: p.getQuestoes()){
                    if (q.getId() == idQuestao){
                        questao = q;//já existe um objeto com esse id na prova
                        break;
                    }
                }
                if (questao.getId() == 0){
                    questao.setId(idQuestao);
                    questao.setEnunciado(enunciado);
                    questao.setFigura(figura);
                    questao.setSomaGabarito(somaGabarito);
                    questao.setTextoIntrodutorio(textoIntrodutorio);
                    questao.setNumero(numero);
                    p.getQuestoes().add(questao);
                    indexAlternativa = 0;
                }
                if (questao.getDisciplina().getId() == 0){
                    questao.getDisciplina().setId(idDisciplina);
                    questao.getDisciplina().setNome(nomeDisciplina);
                }
                Alternativa a = new Alternativa();
                a.setId(idAlternativa);
                a.setTexto(textoAlternativa);
                a.setValor(valor);
                questao.getAlternativas()[indexAlternativa++] = a;
            }
            rs.close();
            ps.close();
            con.close();
            return p;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return p;
        }
    }

}
