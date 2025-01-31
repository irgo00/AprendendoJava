package aprendizado.estruturadedados.AulaED3107queue.src;

public class App {
    
    public static void main(String[] args) throws Exception{
        
        //MyQueue<String> fila = new MyQueue<>(10);
        MyQueueLinkedList<String> fila = new MyQueueLinkedList<>();
        
        fila.enqueue("Valter");
        fila.enqueue("Luís");
        fila.enqueue("Estevam");
        fila.enqueue("Junior");        
        System.out.println(fila);
        fila.dequeue();
        fila.dequeue();
        System.out.println(fila);
        
        fila.dequeue();
        fila.dequeue();
        
        System.out.println(fila);
        
        //fila.dequeue();
    }
    
}
