package aprendizado.EstruturaDeDados.AulaED0807doublylinkedlist.src;

public class App2 {
    
    public static void main(String[] args) {
        
        MyDoublyLinkedList lista1 = new MyDoublyLinkedList();
        MyDoublyLinkedList lista2 = new MyDoublyLinkedList();
        
        lista1.add(3);
        lista1.add(7);
        lista1.add(10);
        System.out.println(lista1);
        lista2.add(1);
        lista2.add(3);
        lista2.add(9);
        System.out.println(lista2);
        lista1.concatenate(lista2);
        System.out.println(lista1);
        lista1.add(11);
        System.out.println(lista1);
    }
    
}
