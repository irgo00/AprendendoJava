package aprendizado.exceptions.uncheckedexceptions;

public class NullPointerExceptionExemplo {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Erro: Objeto nulo! " + e.getMessage());
        }
    }
}
