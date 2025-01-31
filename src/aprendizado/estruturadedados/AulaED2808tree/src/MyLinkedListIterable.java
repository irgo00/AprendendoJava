package aprendizado.estruturadedados.AulaED2808tree.src;

public class MyLinkedListIterable<T> 
        extends MyLinkedList<T> implements MyIterable<T>{

    @Override
    public MyIterator<T> iterator() {
        return new MyListIterator<>(this);
    }
    
}
