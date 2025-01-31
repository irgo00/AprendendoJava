package aprendizado.EstruturaDeDados.AulaED0209binarytree.src;

public class MyLinkedBinaryTree<T> implements BinaryTree<T>{

    private BTreeNode<T> root;
    private int size;

    public MyLinkedBinaryTree() {
        this.root = null;
        size = 0;
    }
    
    @Override
    public Node<T> left(Node<T> v) throws Exception {
        if (this.hasLeft(v)){
            return ((BTreeNode<T>) v).getLeft();
        }else{
            throw new Exception("Não tem nodo à esquerda");
        }
    }

    @Override
    public Node<T> right(Node<T> v) throws Exception {
        if (this.hasRight(v)){
            return ((BTreeNode<T>) v).getRight();
        }else{
            throw new Exception("Não tem nodo à direita");
        }
    }

    @Override
    public boolean hasLeft(Node<T> v) {
        return ((BTreeNode<T>) v).getLeft() != null;
    }

    @Override
    public boolean hasRight(Node<T> v) {
        return ((BTreeNode<T>) v).getRight() != null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.root == null;
    }

    @Override
    public MyIterator<Node<T>> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MyIterable<Node<T>> positions() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T replace(Node<T> v, T t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Node<T> root() throws Exception {
        return this.root;
    }

    @Override
    public Node<T> parent(Node<T> v) {
        return ((BTreeNode<T>) v).getParent();
    }

    @Override
    public MyIterable<Node<T>> children(Node<T> v) {
        MyLinkedListIterable<Node<T>> list = 
                new MyLinkedListIterable<>();
        list.add(((BTreeNode<T>) v).getLeft());
        list.add(((BTreeNode<T>) v).getRight());
        return list;
    }

    @Override
    public boolean isInternal(Node<T> v) {
        return this.hasLeft(v);
    }

    @Override
    public boolean isExternal(Node<T> v) {
        return !isInternal(v);
    }

    @Override
    public boolean isRoot(Node<T> v) {
        return v == root;
    }

    @Override
    public Node<T> addNode(T t, Node<T> parent) throws Exception {

        return null;
    }
    
}
