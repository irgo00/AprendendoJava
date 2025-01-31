package aprendizado.EstruturaDeDados.AulaED3107queue.src;

public class MyQueueLinkedList<T> implements MyQueueInterface<T>{

    private MyLinkedListGenerico<T> linkedList;

    public MyQueueLinkedList() {
        linkedList = new MyLinkedListGenerico<>();
    }
    
    @Override
    public void enqueue(T t) {
        linkedList.add(t);
    }

    @Override
    public T dequeue() throws Exception {
        T t = linkedList.get(0);
        linkedList.remove(t);
        return t;
    }

    @Override
    public int size() {
        return linkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public T front() throws Exception {
        return linkedList.get(0);
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
    
    
    
}
