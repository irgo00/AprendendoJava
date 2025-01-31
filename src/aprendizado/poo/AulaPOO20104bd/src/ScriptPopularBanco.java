package aprendizado.poo.AulaPOO20104bd.src;

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

    public static void inserirLoja(Loja l){
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            String sqlInsertPlataforma = 
                    "insert into loja (nome) values (?)";
            PreparedStatement ps = con.prepareStatement(sqlInsertPlataforma);
            ps.setString(1, l.getNome());
            ps.execute();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    public static void inserirProduto(Produto p){
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            String sqlInsertProduto = 
                    "insert into produto (nome, preco_unitario) values (?, ?)";
            PreparedStatement ps = con.prepareStatement(sqlInsertProduto);
            ps.setString(1, p.getNome());
            ps.setDouble(2, p.getPrecoUnitario());
            ps.execute();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    
    public static void main(String[] args) {
        
        /*
        Plataforma p1 = new Plataforma("Loja Física");
        Plataforma p2 = new Plataforma("Loja Virtual - Site");
        Plataforma p3 = new Plataforma("Loja Virtual - App");
        ScriptPopularBanco.inserirPlataforma(p1);
        ScriptPopularBanco.inserirPlataforma(p2);
        ScriptPopularBanco.inserirPlataforma(p3);
        */
        
        /*
        Loja l1 = new Loja("Loja 1");
        Loja l2 = new Loja("Loja 2");
        Loja l3 = new Loja("Loja 3");
        ScriptPopularBanco.inserirLoja(l1);
        ScriptPopularBanco.inserirLoja(l2);
        ScriptPopularBanco.inserirLoja(l3);
        */
        
        Produto p1 = new Produto("Produto 1", 10.5);
        Produto p2 = new Produto("Produto 2", 1.35);
        ScriptPopularBanco.inserirProduto(p1);
        ScriptPopularBanco.inserirProduto(p2);
        
    }
    
}
