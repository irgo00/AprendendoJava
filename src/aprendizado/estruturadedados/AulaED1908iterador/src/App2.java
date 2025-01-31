package aprendizado.estruturadedados.AulaED1908iterador.src;

public class App2 {
    
    public static void main(String[] args) throws Exception {
        
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        
        MyListIterator<String> iter = new MyListIterator<>(list);
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
    }
    
}
