package aprendizado.basico;

/**
 * Classe que demonstra o uso de estruturas condicionais em Java.
 */
public class EstruturasCondicionais {
    public static void main(String[] args) {
        int numero = 10;

        // Estrutura if-else
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        // Operador ternário
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println("O número é " + resultado);

        // Estrutura switch-case
        int diaSemana = 3;
        String dia;

        switch (diaSemana) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Dia inválido";
        }
        System.out.println("O dia da semana é: " + dia);
    }
}

