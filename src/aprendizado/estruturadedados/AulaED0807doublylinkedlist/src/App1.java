package aprendizado.estruturadedados.AulaED0807doublylinkedlist.src;

public class App1 {
    
    public static void main(String[] args) {
        
        MyDoublyLinkedList list = new MyDoublyLinkedList();
        list.add(8);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(17);
        System.out.println(list);
        list.remove(17);
        System.out.println(list);
        list.add(9);
        System.out.println(list);
        
    }
    
}
