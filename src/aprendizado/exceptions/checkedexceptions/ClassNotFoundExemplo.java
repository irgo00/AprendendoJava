package aprendizado.exceptions.checkedexceptions;

public class ClassNotFoundExemplo {
    public static void main(String[] args) {
        try {
            Class.forName("ClasseInexistente");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: Classe não encontrada! " + e.getMessage());
        }
    }
}
