package aprendizado.EstruturaDeDados.AulaED1408recursividade.src;

public class Exercicio0 {
    
    public int fat(int n){
        if (n == 1){
            return 1;
        }else{
            return n * fat(n - 1);
        }
    }
    
    public static void main(String[] args) {
        
        Exercicio0 ex = new Exercicio0();
        System.out.println(ex.fat(19));
        
    }
    
    
}
