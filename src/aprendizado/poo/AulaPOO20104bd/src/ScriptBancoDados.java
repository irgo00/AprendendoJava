package aprendizado.poo.AulaPOO20104bd.src;

import java.sql.*;

public class ScriptBancoDados {

    public static void criarTabelaPlataforma(){
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            Statement st = con.createStatement();
            String sqlPlataforma = 
                    "create table if not exists plataforma("
                    + "id int not null auto_increment, "
                    + "nome varchar(50), "
                    + "primary key (id));";
            System.out.println(sqlPlataforma);
            st.execute(sqlPlataforma);
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    public static void criarTabelaLoja(){
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            Statement st = con.createStatement();
            String sqlPlataforma = 
                    "create table if not exists loja("
                    + "id int not null auto_increment, "
                    + "nome varchar(50), "
                    + "primary key (id));";
            System.out.println(sqlPlataforma);
            st.execute(sqlPlataforma);
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    public static void criarTabelaProduto(){
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            Statement st = con.createStatement();
            String sqlPlataforma = 
                    "create table if not exists produto("
                    + "id int not null auto_increment, "
                    + "nome varchar(50), "
                    + "preco_unitario double, "
                    + "primary key (id));";
            System.out.println(sqlPlataforma);
            st.execute(sqlPlataforma);
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    
    
    public static void main(String[] args) {
        
        ScriptBancoDados.criarTabelaPlataforma();
        ScriptBancoDados.criarTabelaLoja();
        ScriptBancoDados.criarTabelaProduto();
        
    }

    
}
