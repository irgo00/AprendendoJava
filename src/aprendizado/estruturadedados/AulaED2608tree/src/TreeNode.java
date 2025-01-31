package aprendizado.estruturadedados.AulaED2608tree.src;

public class TreeNode<T> {
    
    private TreeNode<T> parent;
    private MyLinkedListIterator<TreeNode<T>> children; 
    private T element;
    
    public TreeNode(T t, TreeNode<T> parent){
        this.element = t;
        this.parent = parent;
        children = new MyLinkedListIterator<>();
    }

    public TreeNode<T> getParent() {
        return parent;
    }

    public void setParent(TreeNode<T> parent) {
        this.parent = parent;
    }

    public MyLinkedListIterator<TreeNode<T>> getChildren() {
        return children;
    }

    public void setChildren(MyLinkedListIterator<TreeNode<T>> children) {
        this.children = children;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "TreeNode{element= "+
                element+" children {"+children + "}}";
    }
    
    
   
    
    
}
