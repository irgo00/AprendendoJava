package aprendizado.poo.ProjetoSimuladoMVC.src.br.edu.ifpr.irati.ads.dao;

import br.edu.ifpr.irati.ads.modelo.Candidato;
import br.edu.ifpr.irati.ads.modelo.Questao;
import br.edu.ifpr.irati.ads.modelo.Resposta;
import java.sql.*;

public class RespostaDAO {

    public void salvarResposta(Resposta resposta) {

        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();

            if (resposta.getId() == 0) {

                String sqlInsert = "insert into resposta (soma, fkIdCandidato, fkIdQuestao) values (?,?,?)";
                PreparedStatement ps = con.prepareStatement(sqlInsert, PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setInt(1, resposta.getSoma());
                ps.setInt(2, resposta.getCandidato().getId());
                ps.setInt(3, resposta.getQuestao().getId());
                ps.execute();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    resposta.setId(rs.getInt(1));
                }
                rs.close();
                ps.close();
            } else {
                String sqlUpdate = "update resposta set soma = ?, fkIdCandidato = ?, fkIdQuestao = ? where id = ?";
                PreparedStatement ps = con.prepareStatement(sqlUpdate);
                ps.setInt(1, resposta.getSoma());
                ps.setInt(2, resposta.getCandidato().getId());
                ps.setInt(3, resposta.getQuestao().getId());
                ps.setInt(4, resposta.getId());
                ps.execute();
                ps.close();
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public Resposta buscarResposta(Candidato candidato, Questao questao) {
        Resposta resposta = new Resposta();
        resposta.setCandidato(candidato);
        resposta.setQuestao(questao);
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            String sql = "select id, soma from resposta where fkIdCandidato = ? and fkIdQuestao = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, candidato.getId());
            ps.setInt(2, questao.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                resposta.setId(rs.getInt(1));
                resposta.setSoma(rs.getInt(2));
            }
            rs.close();
            ps.close();
            con.close();
            return resposta;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return resposta;
        }
    }
}
