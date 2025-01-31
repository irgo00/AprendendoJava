package aprendizado.EstruturaDeDados.AulaED0307linkedlist.src;

public class MyLinkedListGenerico<T> {

    private Nodo<T> head = null;
    private Nodo<T> tail = null;
    private int numEntries = 0;

    private static class Nodo<T> {

        private T dado;
        private Nodo<T> next;

        public Nodo(T d) {
            dado = d;
            next = null;
        }
    }

    public void add(T d) {
        Nodo<T> novoNodo = new Nodo<>(d);
        novoNodo.next = null;
        //se a lista está vazia, o novo nodo será o cabeça
        if (head == null) {
            head = novoNodo;
        } else {
            tail.next = novoNodo;
        }
        tail = novoNodo;
        numEntries++;
    }

    public void remove(T d) {

        Nodo<T> atual = head;
        if (head != null && atual.dado == d) {
            head = atual.next;
        } else {
            Nodo<T> anterior = null;
            while (atual != null && atual.dado != d) {
                anterior = atual;
                atual = atual.next;
            }

            if (atual == null) {
                System.out.println("Não encontrou");
            } else {
                anterior.next = atual.next;
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
    
    public void concatenate(MyLinkedListGenerico otherList){
        
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
