package aprendizado.poo.AulaPOO22503bd.src;

import java.sql.*;

public class AppTesteConexao {
    
    public static void main(String[] args) {
        
        Conexao conexao = new Conexao();
        Connection con = conexao.conectar();
        System.out.println("Conectou com sucesso");
        
    }
    
}
