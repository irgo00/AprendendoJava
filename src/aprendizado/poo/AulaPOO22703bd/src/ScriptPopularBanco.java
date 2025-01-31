package aprendizado.poo.AulaPOO22703bd.src;

import java.sql.*;

public class ScriptPopularBanco {
    
    public static void inserirPlataforma(Plataforma p){
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            String sqlInsertPlataforma = 
                    "insert into plataforma (nome) values (?)";
            PreparedStatement ps = con.prepareStatement(sqlInsertPlataforma);
            ps.setString(1, p.getNome());
            ps.execute();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    
    public static void main(String[] args) {
        
        Plataforma p1 = new Plataforma("Loja Física");
        Plataforma p2 = new Plataforma("Loja Virtual - Site");
        Plataforma p3 = new Plataforma("Loja Virtual - App");
        ScriptPopularBanco.inserirPlataforma(p1);
        ScriptPopularBanco.inserirPlataforma(p2);
        ScriptPopularBanco.inserirPlataforma(p3);
        
    }
    
}
