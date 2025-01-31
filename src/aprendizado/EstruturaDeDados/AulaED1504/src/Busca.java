package aprendizado.EstruturaDeDados.AulaED1504.src;

public class Busca {
    
    
    public int buscaBinaria(int v[], int valor){

        int N = v.length;
        
        int x = N / 2;
        
        if (valor < v[x]){//está para a esquerda
            
            
            
        }else if (valor > v[x]){//está para a direita
            
        }else{
            return x;
        }
        
        return -1;
        
    }
    
    
}
