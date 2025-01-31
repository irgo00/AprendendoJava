package aprendizado.poo.AulaPOO22003bd.src;

import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {
        
        String separadorCSV = ";";
        String path = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\AulaPOO22003bd\\src\\BASE_AULA-20k.csv";
        Parser parser = new Parser(path, false, separadorCSV);
        ArrayList<Plataforma> plataformas = parser.obterPlataformas();
        ArrayList<Loja> lojas = parser.obterLojas();
        ArrayList<Produto> produtos = parser.obterProdutos();
        ArrayList<Venda> vendas = parser.obterVendas();
        System.out.println(plataformas);
        System.out.println(lojas);
        System.out.println(produtos);
        System.out.println(vendas);
        
    }
    
}
