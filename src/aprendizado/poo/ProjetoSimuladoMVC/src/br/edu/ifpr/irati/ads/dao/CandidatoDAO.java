package aprendizado.poo.ProjetoSimuladoMVC.src.br.edu.ifpr.irati.ads.dao;

import br.edu.ifpr.irati.ads.modelo.Candidato;
import java.sql.*;

public class CandidatoDAO {
    
    /**
     * Buscar por um cpf no banco de dados.
     * Caso não exista, o método cadastra um novo 
     * candidato e retorna o objeto completo.
     * 
     * @param cpf
     * @return 
     */
    public Candidato buscarCPF(String cpf){
        
        Candidato candidato = new Candidato();
        try {
            // consultar o cpf
            String sqlQuery = "select id from candidato where cpf = ?";
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                candidato.setId(rs.getInt(1));
                candidato.setCpf(cpf);
            }else{// se não existir, cadastro
                String sqlInsert = "insert into candidato (cpf) values (?)";
                ps = con.prepareStatement(sqlInsert, PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setString(1, cpf);
                ps.execute();
                rs = ps.getGeneratedKeys();
                if (rs.next()){
                    candidato.setId(rs.getInt(1));
                    candidato.setCpf(cpf);
                }               
            }
            rs.close();
            ps.close();
            con.close();
            return candidato;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return candidato;
        }
    }
    
    
}
