package aprendizado.EstruturaDeDados.AulaED1408recursividade.src;

public class Exercicio3 {
    
    public int fib(int n){
        if (n == 2 || n == 1){
            return 1;
        }else{
            return fib(n - 1) + fib(n - 2);
        }
    }
    
    
    public static void main(String[] args) {
        
        Exercicio3 ex = new Exercicio3();
        
        int soma = 0;
        for (int i = 1; i <= 10; i++){
            soma += ex.fib(i);
        }
        System.out.println(soma);
        
        
    }
    
}
