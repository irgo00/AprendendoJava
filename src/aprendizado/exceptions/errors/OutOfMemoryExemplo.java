package aprendizado.exceptions.errors;

public class OutOfMemoryExemplo {
    public static void main(String[] args) {
        try {
            int[] largeArray = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Erro: Memória insuficiente! " + e.getMessage());
        }
    }
}
