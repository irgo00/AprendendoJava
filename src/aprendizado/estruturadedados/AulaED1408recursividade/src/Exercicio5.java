package aprendizado.estruturadedados.AulaED1408recursividade.src;

public class Exercicio5 {
    
    public int pesqLin(int x, int v[], int i, int k){
        
        if (i > v.length-1 || k > v.length-1){
            return -1;
        }else if (i > k){
            return -1;
        }else if (v[i] == x){
            return i;
        }else{
            return pesqLin(x, v, i + 1, k);
        }
    }
    
    public static void main(String[] args) {
        Exercicio5 ex = new Exercicio5();
        int v[] = {5, 0, -2, 9, 6, 1, 10, 7, 11};
        System.out.println(ex.pesqLin(6, v, 4, 5));
        
    }
    
}
