package aprendizado.poo.AulaPOO21704bd.src;

import java.sql.*;

public class ScriptBancoDados {

    public static void criarTabelaPlataforma() {
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            Statement st = con.createStatement();
            String sqlPlataforma
                    = "create table if not exists plataforma("
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

    public static void criarTabelaVendas() {
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            Statement st = con.createStatement();
            String sql
                    = "create table if not exists venda("
                    + "id int not null auto_increment,"
                    + "mes varchar(25),"
                    + "ano int,"
                    + "quantidade int,"
                    + "valorTotal double,"
                    + "fkIdPlataforma int not null,"
                    + "fkIdLoja int not null,"
                    + "fkIdProduto int not null,"
                    + "foreign key (fkIdPlataforma) references plataforma(id),"
                    + "foreign key(fkIdLoja) references loja(id),"
                    + "foreign key(fkIdProduto) references produto(id),"
                    + "primary key(id))";
            System.out.println(sql);
            st.execute(sql);
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {

        ScriptBancoDados.criarTabelaPlataforma();
        ScriptBancoDados.criarTabelaVendas();
    }
    

}
