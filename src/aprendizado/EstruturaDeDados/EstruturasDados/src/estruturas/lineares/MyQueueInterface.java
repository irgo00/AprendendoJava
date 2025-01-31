package aprendizado.EstruturaDeDados.EstruturasDados.src.estruturas.lineares;

public interface MyQueueInterface<T> {
    
    public void enqueue(T t);
    
    public T dequeue() throws Exception;
    
    public int size();
    
    public boolean isEmpty();
    
    public T front() throws Exception;
            
}
