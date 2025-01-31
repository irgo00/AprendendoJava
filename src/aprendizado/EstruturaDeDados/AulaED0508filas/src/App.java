package aprendizado.EstruturaDeDados.AulaED0508filas.src;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        MyPriorityQueue<String> fila = new MyPriorityQueue<>();
        fila.enqueue("Zé",1);
        fila.enqueue("João",1);
        fila.enqueue("Maria",2);
        fila.enqueue("Ana",2);  
        fila.enqueue("Luis",2);
        fila.enqueue("Zé2",3);
        System.out.println(fila);
        //fila.dequeue();
        //fila.dequeue();
        //System.out.println(fila);
        
        //fila.dequeue();
        //fila.dequeue();
        
        //System.out.println(fila);
        
    }
    
}
