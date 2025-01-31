package aprendizado.exceptions.uncheckedexceptions;

public class ArrayIndexOutOfBoundsExemplo {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites! " + e.getMessage());
        }
    }
}
