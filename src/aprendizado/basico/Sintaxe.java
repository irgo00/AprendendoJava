package aprendizado.basico;

/**
 * Classe que demonstra a sintaxe básica do Java
 */
public class Sintaxe {

    // Metodo principal / classe main
    public static void main(String[] args) {
        System.out.println("Hello World!"); // Exibe uma mensagem no console

        // Declaração de variáveis
        int numero = 10;
        double preco = 9.99;
        String mensagem = "Mensagem teste";

        System.out.println("Número: " + numero);
        System.out.println("Preço: " + preco);
        System.out.println("Mensagem: " + mensagem);

        // Estrutura condicional
        if (numero > 5) {
            System.out.println("O número é maior que 5");
        } else {
            System.out.println("O número é menor ou igual a 5");
        }

        // Estrutura de repetição
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteração: " + (i + 1));
        }

        // Operador ternário
        String status = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println("O número " + numero + " é " + status);

        // Chamada de metodo
        exibirMensagem("Métodos tornam o código reutilizável!");
    }

    /**
     * Metodo para exibir uma mensagem
     * @param msg Mensagem a ser exibida
     */
    public static void exibirMensagem(String msg) {
        System.out.println(msg);
    }
}
