package aprendizado.EstruturaDeDados.AulaED0107linkedlist.src;

public class AppTeste1 {
    
    public static void main(String[] args) {
        
        MyLinkedListV1 linkedList = new MyLinkedListV1();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(6);
        linkedList.add(10);
        
        System.out.println(linkedList.toString());
        
        linkedList.remove(6);
        
        System.out.println(linkedList.toString());
        
        linkedList.remove(10);
        linkedList.remove(4);
        linkedList.remove(3);
        
        System.out.println(linkedList.toString());
        
    }
    
}
