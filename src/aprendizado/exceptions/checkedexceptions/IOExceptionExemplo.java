package aprendizado.exceptions.checkedexceptions;

import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExemplo {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("arquivo_inexistente.txt");
        } catch (IOException e) {
            System.out.println("Erro de entrada/saída: " + e.getMessage());
        }
    }
}
