package aprendizado.EstruturaDeDados.EstruturasDados.src.estruturas.lineares;

public class MyStack<T> {
    
    private final int maxEntries;
    private int numEntries;
    private final Object objetos[];

    public MyStack() {
        this.maxEntries = 10;
        this.numEntries = 0;
        this.objetos = new Object[maxEntries];
    }

    public MyStack(int maxEntries) {
        this.maxEntries = maxEntries;
        this.numEntries = 0;
        this.objetos = new Object[maxEntries];
    }
    
    
    public void push(T t) throws Exception{
        if (!this.isFull()){
            this.objetos[numEntries] = t;
            numEntries++;
        }else{
            throw new Exception("Overflow");
        }        
    }
    
    public T pop() throws Exception{
        if (!this.isEmpty()){
            numEntries--;
            return (T) objetos[numEntries];
        }else{
            throw new Exception("Underflow");
        }
    }
    
    public T peek() throws Exception{
        if (!this.isEmpty()){
            return (T) objetos[numEntries-1];
        }else{
            throw new Exception("Is empty");
        }
        
    }
    
    public int size(){
        return numEntries;
    }
    
    public boolean isFull(){
        return numEntries == maxEntries;
    }
    
    public boolean isEmpty(){
        return numEntries == 0;
    }
    
}
