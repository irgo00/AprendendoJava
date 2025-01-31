package aprendizado.EstruturaDeDados.AulaED0307linkedlist.src;

public class AppTeste2 {
    
    public static void main(String[] args) {
        
        MyLinkedList list1 = new MyLinkedList();
        list1.add(4);
        list1.add(6);
        list1.add(3);
        list1.add(10);
        list1.add(8);
        list1.add(7);
        System.out.println(list1);
        
        MyLinkedList list2 = new MyLinkedList();
        list2.add(15);
        list2.add(18);
        list2.add(20);
        
        System.out.println(list2);
        
        list1.concatenate(list2);
        System.out.println(list1);
        list2.concatenate(list1);
        System.out.println(list2);

        
    }
    
}
