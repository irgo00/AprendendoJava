package aprendizado.estruturadedados.AulaED1908iterador.src;

public class App1 {
    
    public static void main(String[] args) {
        
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        
        
    }
    
}
