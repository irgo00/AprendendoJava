package aprendizado.estruturadedados.EstruturasDados.src.estruturas.lineares;

public class MyDoublyLinkedList<T> {

    private Nodo head = null;
    private Nodo tail = null;
    private int numEntries = 0;

    private static class Nodo<T> {

        private T dado;
        private Nodo<T> next;
        private Nodo<T> previous;

        public Nodo(T d) {
            dado = d;
            next = null;
            previous = null;
        }
    }

    public void add(T d) {
        Nodo<T> novoNodo = new Nodo(d);
        novoNodo.next = null;
        //se a lista está vazia, o novo nodo será o cabeça
        if (head == null) {
            head = novoNodo;
            head.previous = null;
        } else {
            tail.next = novoNodo;
            novoNodo.previous = tail;
        }
        tail = novoNodo;
        numEntries++;
    }

    public void remove(T d) {

        Nodo<T> atual = head;
        //se a lista não está vazia e o elemento procurado está no head
        if (head != null && atual.dado == d) {
            head = atual.next;
        } else {
            Nodo anterior = null;
            //enquanto não cheguei ao aterramento da lista e não encontrei o elemento
            while (atual != null && atual.dado != d) {
                anterior = atual;
                atual = atual.next;
            }
            
            if (atual == null) {
                System.out.println("Não encontrou");
            } else {
                //remove o elemento
                if (atual != tail){
                    anterior.next = atual.next;
                    atual.next.previous = anterior;
                }else{
                    anterior.next = null;
                    tail = anterior;
                }
                numEntries--;
            }
        }

    }

    public int indexOf(T d) {
        int index = 0;
        Nodo<T> atual = head;
        while (atual != null && atual.dado != d) {
            atual = atual.next;
            index++;
        }
        if (atual == null) {
            return -1;
        }
        return index;
    }

    public T get(int index) throws IndexOutOfBoundsException{
        Nodo<T> atual = head;
        int count = 0;
        while (atual != null){
            if (count == index){
                return atual.dado;
            }
            atual = atual.next;
            count++;
        }
        throw new IndexOutOfBoundsException();        
    }
    
    public int size(){
        return numEntries;
    }
    
    public boolean isEmpty(){
        if (numEntries == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public void concatenate(MyDoublyLinkedList otherList){
        
        otherList.head.previous = tail;
        tail.next = otherList.head;                
        tail = otherList.tail;
        numEntries += otherList.numEntries;
        
    }
    
    
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        Nodo ultimo = head;
        if (ultimo == null) {
            sb.append("Lista vazia");
        } else {
            while (ultimo.next != null) {
                sb.append(ultimo.dado);
                sb.append("\t");
                ultimo = ultimo.next;
            }
            sb.append(ultimo.dado);
        }
        return sb.toString();
    }
}
