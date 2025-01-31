package aprendizado.estruturadedados.AulaED0307linkedlist.src;

public class AppTeste1 {
    
    public static void main(String[] args) {
        
        MyLinkedList list = new MyLinkedList();
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(10);
        list.add(8);
        list.add(7);
        System.out.println(list);
        //list.remove(6);
        //System.out.println(list);
        System.out.println(list.indexOf(23));
        System.out.println("");
        System.out.println(list.get(4));
        
        
    }
    
}
