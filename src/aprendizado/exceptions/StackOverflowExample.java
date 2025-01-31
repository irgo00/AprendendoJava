package aprendizado.exceptions;

// Exemplo de StackOverflowError
public class StackOverflowExample {
    public static void recursiveMethod() {
        recursiveMethod(); // Chamada recursiva infinita
    }
    public static void main(String[] args) {
        recursiveMethod();
    }
}