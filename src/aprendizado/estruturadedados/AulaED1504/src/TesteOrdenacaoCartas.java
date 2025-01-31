package aprendizado.estruturadedados.AulaED1504.src;

public class TesteOrdenacaoCartas {
    
    public static void main(String[] args) throws Exception {
        
        Naipe n = new Naipe("Ouro");
        Carta c1 = new Carta("A",1 , n);
        Carta c2 = new Carta("2",2 , n);
        Carta c3 = new Carta("3",3 , n);
        Carta c4 = new Carta("4",4 , n);
        Carta c5 = new Carta("5",5 , n);
        Carta c6 = new Carta("6",6 , n);
        Carta c7 = new Carta("7",7 , n);
        Carta c8 = new Carta("8",8 , n);
        
        MyArray<Carta> baralho = new MyArray<>(8);
        
        baralho.add(c8);
        baralho.add(c3);
        baralho.add(c4);
        baralho.add(c1);
        baralho.add(c7);
        baralho.add(c5);
        baralho.add(c2);
        baralho.add(c6);
        
        MethodSort method = MethodSort.INSERTIONSORT;
        
        baralho.sort(method, new ComparadorCarta());
        
        System.out.println(baralho);
        
        baralho.shuffle();
        
        System.out.println(baralho);
        
        baralho.sort(method, new ComparadorCarta());
        
        System.out.println(baralho);
        
        
        
    }
    
}
