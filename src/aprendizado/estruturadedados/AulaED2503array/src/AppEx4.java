package aprendizado.estruturadedados.AulaED2503array.src;

public class AppEx4 {
    
    public static void criarCartas(Baralho baralho) throws Exception{
        Naipe ouro = new Naipe("Ouro");
        Naipe espadas = new Naipe("Espadas");
        Naipe copas = new Naipe("Copas");
        Naipe paus = new Naipe("Paus");
        
        Naipe naipes[] = new Naipe[]{ouro, espadas, copas, paus};
        
        String simbolos[] = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        
        for (Naipe n: naipes){
            for (int i = 0; i < simbolos.length; i++){
                Carta c = new Carta(simbolos[i],i+1, n);
                baralho.add(c);
            }
        }              
    }
    
    public static void main(String[] args) throws Exception {
        
        Baralho baralho = new Baralho(52);
        AppEx4.criarCartas(baralho);
        System.out.println(baralho);
        
    }
    
}
