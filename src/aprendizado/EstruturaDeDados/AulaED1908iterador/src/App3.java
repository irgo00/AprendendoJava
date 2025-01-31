package aprendizado.EstruturaDeDados.AulaED1908iterador.src;

import java.util.ArrayList;
import java.util.List;

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
