package aprendizado.EstruturaDeDados.EstruturasDados.src.estruturas.arvores;

public class MyLinkedListIterable<T>
        extends MyLinkedList<T> implements MyIterable<T>{

    @Override
    public MyIterator<T> iterator() {
        return new MyListIterator<>(this);
    }
    
}
