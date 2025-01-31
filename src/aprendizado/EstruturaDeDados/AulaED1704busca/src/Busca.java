package aprendizado.EstruturaDeDados.AulaED1704busca.src;

public class Busca {
    
    
    public static int buscaBinaria(int v[], int valor){
        int menor = 0;
        int maior = v.length - 1;
        int meio;
        
        while (menor <= maior){
            meio = menor + (maior - menor) / 2;
            if (v[meio] < valor){
                menor = meio + 1;
            }else if (v[meio] > valor){
                maior = meio - 1;
            }else{
                return meio;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int v[] = new int[]{2, 5, 9, 10, 12, 13, 17, 18, 20, 22, 23, 25, 29, 31, 35, 37, 41, 46, 49,60};
        System.out.println(Busca.buscaBinaria(v, 37));
    }
    
}
