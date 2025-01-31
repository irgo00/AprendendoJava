package aprendizado.EstruturaDeDados.AulaED2608tree.src;

public class MyLinkedListIterator<T>
        extends MyLinkedList<T> implements MyIterable<T>{

    @Override
    public MyIterator<T> iterator() {
        return new MyListIterator<>(this);
    }
    
}
