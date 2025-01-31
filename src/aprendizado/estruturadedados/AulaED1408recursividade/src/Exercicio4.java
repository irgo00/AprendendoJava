package aprendizado.estruturadedados.AulaED1408recursividade.src;

public class Exercicio4 {
    
    public int fib(int n){
        if (n == 2 || n == 1){
            return 1;
        }else{
            return fib(n - 1) + fib(n - 2);
        }
    }
    
    public int soma(int n){
        if (n == 1){
            return 1;
        }else{
            return fib(n) + soma(n - 1);
        }
    }
    
    public static void main(String[] args) {
        Exercicio4 ex = new Exercicio4();
        System.out.println(ex.soma(10));
        
    }
    
}
