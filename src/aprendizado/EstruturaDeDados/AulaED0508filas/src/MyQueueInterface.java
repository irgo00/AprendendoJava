package aprendizado.EstruturaDeDados.AulaED0508filas.src;

public interface MyQueueInterface<T> {
    
    public void enqueue(T t);
    
    public T dequeue() throws Exception;
    
    public int size();
    
    public boolean isEmpty();
    
    public T front() throws Exception;
            
}
