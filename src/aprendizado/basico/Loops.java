package aprendizado.basico;

/**
 * Classe que demonstra os tipos de Loops em Java
 */
public class Loops {
    public static void main(String[] args) {
        
        // Exemplo de loop 'for'
        System.out.println("Usando for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contagem: " + i);
        }

        // Exemplo de loop 'while'
        System.out.println("\nUsando while loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Contagem: " + j);
            j++;
        }

        // Exemplo de loop 'do-while'
        System.out.println("\nUsando do-while loop:");
        int k = 1;
        do {
            System.out.println("Contagem: " + k);
            k++;
        } while (k <= 5);
    }
}

