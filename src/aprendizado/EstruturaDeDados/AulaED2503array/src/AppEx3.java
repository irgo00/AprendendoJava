package aprendizado.EstruturaDeDados.AulaED2503array.src;

import java.util.Random;

public class AppEx3 {
    
    public static Partida encontrarMaior(Scores scores) throws Exception{
        Partida pMaior = scores.get(0);
        for (int i = 0; i < scores.size(); i++){
            Partida aux = scores.get(i);
            if (pMaior.getScore() < aux.getScore()){
                pMaior = aux;
            }
        }
        return pMaior;
    }
    
    public static double calcularMedia(Scores scores) throws Exception{
        double media = 0;
        for (int i = 0; i < scores.size(); i++){
            media += scores.get(i).getScore();
        }
        media /= scores.size();
        return media;
    }
    
    
    public static void main(String[] args) throws Exception {
        
        int tamanho = 20;
        
        Random gerador = new Random();
        Scores scores = new Scores(tamanho);
        for (int i = 0; i < tamanho; i++){
            int x = gerador.nextInt(100,1001);
            Partida p = new Partida("Zé"+i, x);
            scores.add(p);
        }
        System.out.println(scores);
        
        //localizar a partida com maior pontuação
        Partida pMaior = AppEx3.encontrarMaior(scores);
        System.out.println(pMaior);
        
        //calcular media
        double media = AppEx3.calcularMedia(scores);
        System.out.println(media);
        
        
        for (int i = 0; i < 10; i++){
            Partida maior = AppEx3.encontrarMaior(scores);
            scores.remove(maior);
        }
        System.out.println(AppEx3.calcularMedia(scores));
        
        
    }
    
}
