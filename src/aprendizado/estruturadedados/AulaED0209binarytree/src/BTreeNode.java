package aprendizado.estruturadedados.AulaED0209binarytree.src;

public class BTreeNode<T> implements Node<T>{

    private T element;
    
    private BTreeNode<T> left;
    
    private BTreeNode<T> right;
    
    private BTreeNode<T> parent;

    public BTreeNode(T element, BTreeNode<T> parent) {
        this.element = element;
        this.parent = parent;
        this.left = null;
        this.right = null;
    }
        
    public BTreeNode(T element, BTreeNode<T> left, BTreeNode<T> right, BTreeNode<T> parent) {
        this.element = element;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    public BTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BTreeNode<T> left) {
        this.left = left;
    }

    public BTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BTreeNode<T> right) {
        this.right = right;
    }

    public BTreeNode<T> getParent() {
        return parent;
    }

    public void setParent(BTreeNode<T> parent) {
        this.parent = parent;
    }

    public void setElement(T element) {
        this.element = element;
    }

    @Override
    public T getElement() {
        return element;
    }
    
}
