package aprendizado.exceptions.uncheckedexceptions;

public class IllegalArgumentExceptionExemplo {
    public static void main(String[] args) {
        try {
            divisao(10, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida");
        }
        return a / b;
    }
}
