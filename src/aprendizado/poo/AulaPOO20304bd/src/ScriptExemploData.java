package aprendizado.poo.AulaPOO20304bd.src;

import java.sql.*;

public class ScriptExemploData {

    public static void cadastrarRegistro(Registro r) {

        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            String sql = "insert into registro (descricao, data_hora) values (?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,r.getDescricao());
            ps.setDate(2, new java.sql.Date(r.getDataHora().getTime()));
            ps.execute();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
    }
    

}
