package aprendizado.exceptions.errors;

// Exemplo de StackOverflowError
public class StackOverflowExemplo {
    public static void recursiveMethod() {
        recursiveMethod(); // Chamada recursiva infinita
    }
    public static void main(String[] args) {
        recursiveMethod();
    }
}