package aprendizado.estruturadedados.AulaED0107linkedlist.src;

public class MyLinkedListV1 {

    private Nodo head = null;

    private static class Nodo {

        private int dado;
        private Nodo next;

        public Nodo(int d) {
            dado = d;
            next = null;
        }
    }

    public void add(int d) {
        Nodo novoNodo = new Nodo(d);
        novoNodo.next = null;
        //se a lista está vazia, o novo nodo será o cabeça
        if (head == null) {
            head = novoNodo;
        } else {
            Nodo ultimo = head;
            while (ultimo.next != null) {
                ultimo = ultimo.next;
            }
            ultimo.next = novoNodo;
        }
    }

    public void remove(int d){
        
        Nodo atual = head;
        if (head != null && atual.dado == d){
            head = atual.next;
        }else{
            Nodo anterior = null;
            while (atual != null && atual.dado != d){
                anterior = atual;
                atual = atual.next;
            }
            
            if (atual == null){
                System.out.println("Não encontrou");
            }else{
                anterior.next = atual.next;
            }
        }
        
    }
    
    
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        Nodo ultimo = head;
        if (ultimo == null){
            sb.append("Lista vazia");
        }else{
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
