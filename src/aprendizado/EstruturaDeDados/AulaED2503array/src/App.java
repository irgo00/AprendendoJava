package aprendizado.EstruturaDeDados.AulaED2503array.src;

public class App {

    public static void main(String[] args) throws Exception{
        
        Partida p1 = new Partida("Zé", 780);
        Partida p2 = new Partida("Ana", 600);
        Partida p3 = new Partida("João", 900);
        Partida p400000 = new Partida("Maria", 880);
        
        Scores scores = new Scores(10);
        scores.add(p1);
        scores.add(p2);
        scores.add(p3);
        scores.add(p400000);
        
        System.out.println(scores);
        
        System.out.println(scores.isEmpty());
        System.out.println(scores.isFull());
        
        System.out.println(scores.get(3));
        System.out.println(scores.indexOf(p3));
        
    }
}
