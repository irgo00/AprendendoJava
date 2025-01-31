package aprendizado.EstruturaDeDados.AulaED0508filas.src;

public class MyQueue<T> implements MyQueueInterface<T>{

    
    
    private MyArray<T> array;

    public MyQueue() {
        array = new MyArray<>();
    }
    
    public MyQueue(int numEntries){
        array = new MyArray<>(numEntries);
    }
    
    @Override
    public void enqueue(T t) {
        try {
            array.add(t);
        } catch (Exception ex) {
        }
    }

    @Override
    public T dequeue() throws Exception {
        T t = array.get(0);
        array.remove(t);
        return t;
    }

    @Override
    public int size() {
        return array.size();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }
    
    public boolean isFull(){
        return array.isFull();
    }

    @Override
    public T front() throws Exception{
        return array.get(0);
    }

    @Override
    public String toString() {
        return array.toString();
    }
    
    
    
}
