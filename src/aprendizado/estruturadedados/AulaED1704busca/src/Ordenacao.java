package aprendizado.estruturadedados.AulaED1704busca.src;

public class Ordenacao {

    public void bubbleSort(int v[]) {

        int N = v.length;
        int pivo = v.length - 2;
        int aux;
        for (int j = 0; j < N; j++) {
            for (int i = 0; i <= pivo; i++) {
                if (v[i] > v[i + 1]) {
                    aux = v[i + 1];
                    v[i + 1] = v[i];
                    v[i] = aux;
                }
            }
        }
    }

    public void selectionSort(int v[]) {
        int N = v.length;

        int aux;
        for (int j = 0; j < N; j++) {
            int menor = v[j];
            int pMenor = j;
            for (int i = j+1; i < N; i++) {
                if (v[i] < menor){
                    menor = v[i];
                    pMenor = i;
                }
            }
            aux = v[pMenor];
            v[pMenor] = v[j];
            v[j] = aux;
        }
    }

    public void insertionSort(int v[]) {

        int N = v.length;
        for (int j = 1; j < N; j++){
            int aux = v[j];
            int i;
            for (i = j; i > 0 && v[i-1] >= aux; i--){
                v[i] = v[i-1];
            }
            v[i] = aux;
        }
        
    }

}
