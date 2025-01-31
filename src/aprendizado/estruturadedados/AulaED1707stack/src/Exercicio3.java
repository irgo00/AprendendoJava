package aprendizado.estruturadedados.AulaED1707stack.src;

import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        String palavra = teclado.nextLine();
        MyStack<Character> stack = new MyStack<>(100);
        String reversa;
        
        for (int i = 0; i < palavra.length(); i++){            
            stack.push(palavra.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());                        
        }
        reversa = sb.toString();
        System.out.println(reversa);
        
    }
    
    
}
