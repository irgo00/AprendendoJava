package aprendizado.basico;

/**
 * Classe que demonstra os principais tipos de dados e variáveis em Java
 */
public class TiposDeDados {
    public static void main(String[] args) {

        // Tipos primitivos
        byte pequenoNumero = 127; // -128 a 127
        short numeroCurto = 32000; // -32.768 a 32.767
        int numero = 100000; // -2^31 a 2^31-1
        long numeroLongo = 10000000000L; // -2^63 a 2^63-1, caso exceda o limite de int, deve colocar L no final

        float numeroDecimalCurto = 10.5f; // Precisão de 7 dígitos, sempre colocar f no final
        double numeroDecimalLongo = 20.99; // Precisão de 15 dígitos

        char caractere = 'A'; // Armazena um único caractere
        boolean verdadeiroOuFalso = true; // true ou false

        // Tipos de referência
        String texto = "Olá, Java!";

        // Exibindo os valores
        System.out.println("Byte: " + pequenoNumero);
        System.out.println("Short: " + numeroCurto);
        System.out.println("Int: " + numero);
        System.out.println("Long: " + numeroLongo);
        System.out.println("Float: " + numeroDecimalCurto);
        System.out.println("Double: " + numeroDecimalLongo);
        System.out.println("Char: " + caractere);
        System.out.println("Boolean: " + verdadeiroOuFalso);
        System.out.println("String: " + texto);
    }
}
