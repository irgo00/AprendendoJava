package aprendizado.EstruturaDeDados.AulaED0209binarytree.src;

public class MyLinkedListIterable<T> 
        extends MyLinkedList<T> implements MyIterable<T>{

    @Override
    public MyIterator<T> iterator() {
        return new MyListIterator<>(this);
    }
    
}
