package aprendizado.estruturadedados.AulaED0209binarytree.src;

public interface BinaryTree<T> extends Tree<T>{
    
    public Node<T> left(Node<T> v) throws Exception;
    
    public Node<T> right(Node<T> v) throws Exception;
    
    public boolean hasLeft(Node<T> v);
    
    public boolean hasRight(Node<T> v);
    
}
