package aprendizado.EstruturaDeDados.AulaED1004.src;

import java.util.Date;
import java.util.Random;

public class TesteOrdenacaoApp {

    public static void testeOrdenarVetorPequeno() {
        Ordenacao o = new Ordenacao();
        int v[] = new int[]{4, 3, 7, 5, 0, 10};
        o.selectionSort(v);
        for (int i : v) {
            System.out.println(i);
        }
    }

    public static double testeTempoOrdenacao(int itens, String algoritmo) {
        Random gerador = new Random();
        int v[] = new int[itens];
        for (int i = 0; i < itens; i++) {
            v[i] = gerador.nextInt(0, 10000000);
        }
        Ordenacao o = new Ordenacao();
        switch (algoritmo) {
            case "bubblesort":
            {
                Date inicio = new Date();
                o.bubbleSort(v);
                Date fim = new Date();
                return (fim.getTime() - inicio.getTime()) / 1000.0;
            }
            case "selectionsort":
            {
                Date inicio = new Date();
                o.selectionSort(v);
                Date fim = new Date();
                return (fim.getTime() - inicio.getTime()) / 1000.0;
            }
            case "insertionsort":
            {
                Date inicio = new Date();
                o.insertionSort(v);
                Date fim = new Date();
                return (fim.getTime() - inicio.getTime()) / 1000.0;
            }
            default:
                System.out.println("Opção inválida");
                return 0;
        }
        
    }

    public static void main(String[] args) {

        //TesteOrdenacaoApp.testeOrdenarVetorPequeno();
        
        
        String alg = "selectionsort";
        int numItens[] = new int[]{1000, 10000, 100000, 1000000};
        
        for (int numI: numItens){
            double t = TesteOrdenacaoApp.testeTempoOrdenacao(numI,alg);
            System.out.println(numI+"\t"+t+" segundos");
        }
        
        

    }

}
