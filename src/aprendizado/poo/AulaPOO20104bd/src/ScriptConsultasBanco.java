package aprendizado.poo.AulaPOO20104bd.src;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ScriptConsultasBanco {
    
    public static List<Produto> buscarProdutos(){
        List<Produto> produtos = new ArrayList<>();
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            String sql = "select id, nome, preco_unitario from produto";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                double preco = rs.getDouble(3);
                Produto p = new Produto(id, nome, preco);
                produtos.add(p);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return produtos;
    }
    
    public static Produto buscarProdutoPorId(int id){
        Produto p = new Produto();
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            String sql = "select id, nome, preco_unitario from produto where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                id = rs.getInt(1);
                String nome = rs.getString(2);
                double preco = rs.getDouble(3);
                p = new Produto(id, nome, preco);
            }
            rs.close();
            ps.close();
            con.close();            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return p;
    }
    
    public static double buscarSomaProdutos(){
        double soma = -1;
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            String sql = "select sum(preco_unitario) as soma from produto";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                soma = rs.getDouble("soma");
            }
            rs.close();
            ps.close();
            con.close();            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return soma;
    }
    
    public static void main(String[] args) {
        
        List<Produto> produtos = ScriptConsultasBanco.buscarProdutos();
        for (Produto p: produtos){//for each
            System.out.println(p);
        }
        
        System.out.println(ScriptConsultasBanco.buscarProdutoPorId(2));
        
        System.out.println(ScriptConsultasBanco.buscarSomaProdutos());
        
    }
    
}
