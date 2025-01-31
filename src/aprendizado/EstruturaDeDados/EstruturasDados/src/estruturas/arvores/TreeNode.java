package aprendizado.EstruturaDeDados.EstruturasDados.src.estruturas.arvores;

public class TreeNode<T> implements Node<T>{
    
    private Node<T> parent;
    private MyLinkedListIterable<Node<T>> children; 
    private T element;
    
    public TreeNode(T t, Node<T> parent){
        this.element = t;
        this.parent = parent;
        children = new MyLinkedListIterable<>();
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public MyLinkedListIterable<Node<T>> getChildren() {
        return children;
    }

    public void setChildren(MyLinkedListIterable<Node<T>> children) {
        this.children = children;
    }

    @Override
    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Node{element= "+
                element+" children {"+children + "}}";
    }
    
    
   
    
    
}
