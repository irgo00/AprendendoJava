package aprendizado.EstruturaDeDados.EstruturasDados.src.estruturas.lineares;

public class MyPriorityQueue<T> {

    private static class Nodo<T> {

        private T dado;
        private int prioridade;

        public Nodo(T d, int prioridade) {
            dado = d;
            this.prioridade = prioridade;
        }

        public T getDado() {
            return this.dado;
        }
    }        

    private MyArray<Nodo> array;
    
    public MyPriorityQueue() {
        array = new MyArray<>();
    }
    
    public MyPriorityQueue(int numEntries){
        array = new MyArray<>(numEntries);
    }

    public void enqueue(T t, int p) {
        try {
            
            MyStack<Nodo> stack = new MyStack<>(array.size());
            
            Nodo n = new Nodo(t, p);
            int pInserir = 0;
            if (!this.isFull()){
                for (int i = array.size()-1; i >= 0; i--){
                    if (array.get(i).prioridade >= n.prioridade){
                        pInserir = i + 1;
                        break;
                    }
                }                
                if (pInserir == array.size()){//vai para o final da fila
                    array.add(n);
                }else{//deslocar os elementos uma posição para liberar espaço
                    System.out.println(pInserir);
                    for (int i = array.size()-1; i >= pInserir; i--){
                        Nodo nodo = array.get(i);
                        stack.push(nodo);
                        array.remove(nodo);
                    }
                    array.add(n);
                    while (!stack.isEmpty()){
                        array.add(stack.pop());
                    }
                }
            }else{
                System.out.println("Fila cheia...");
            }
        } catch (Exception ex) {
        }
    }

    public T dequeue() throws Exception {
        Nodo n = array.get(0);
        array.remove(n);
        return (T) n.dado;
    }

    public int size() {
        return array.size();
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }
    
    public boolean isFull(){
        return array.isFull();
    }

    public T front() throws Exception {
        Nodo n = array.get(0);      
        return (T) n.getDado();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.size(); i++){
            try {
                sb.append(array.get(i).dado);
                sb.append(" ");
            } catch (Exception ex) {
            }
        }
        return sb.toString();
    }

}
