package aprendizado.basico;

/**
 * Classe que demonstra o uso de funções (métodos) em Java.
 */
public class Funcoes {
    public static void main(String[] args) {
        saudacao();
        int soma = somar(5, 10);
        System.out.println("A soma é: " + soma);

        boolean ehPar = verificarPar(8);
        System.out.println("O número 8 é par? " + ehPar);
    }

    // Metodo sem retorno e sem parâmetros
    public static void saudacao() {
        System.out.println("Olá usuário");
    }

    // Metodo com retorno e com parâmetros
    public static int somar(int a, int b) {
        return a + b;
    }

    // Metodo com retorno booleano
    public static boolean verificarPar(int numero) {
        return numero % 2 == 0;
    }
}
