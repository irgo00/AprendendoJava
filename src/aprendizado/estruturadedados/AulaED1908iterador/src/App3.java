package aprendizado.estruturadedados.AulaED1908iterador.src;

public class App3 {
    
    public static void main(String[] args) throws Exception {
        
        MyLinkedListIterator<String> list 
                = new MyLinkedListIterator<>();
        list.add("a");
        list.add("b");
        list.add("c");
        
        MyIterator<String> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }      
        
    }
    
}
