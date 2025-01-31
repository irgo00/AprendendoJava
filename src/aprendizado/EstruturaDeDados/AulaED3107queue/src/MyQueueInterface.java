package aprendizado.EstruturaDeDados.AulaED3107queue.src;

public interface MyQueueInterface<T> {
    
    public void enqueue(T t);
    
    public T dequeue() throws Exception;
    
    public int size();
    
    public boolean isEmpty();
    
    public T front() throws Exception;
            
}
