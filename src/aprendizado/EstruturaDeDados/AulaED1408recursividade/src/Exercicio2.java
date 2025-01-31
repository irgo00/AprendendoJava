package aprendizado.EstruturaDeDados.AulaED1408recursividade.src;

public class Exercicio2 {
    
    public int potencia(int x, int y){
        if (y == 1){
            return x;
        }else{
            return x * potencia(x, y - 1);
        }
    }
    
    public static void main(String[] args) {
        
        Exercicio2 ex = new Exercicio2();
        System.out.println(ex.potencia(5, 8));
        
    }
    
}
