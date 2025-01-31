package aprendizado.EstruturaDeDados.AulaED2808tree.src;

public class MyTree<T> implements Tree<T>{

    private TreeNode<T> root;
    
    public MyTree(){
        root = null;
    }
    
    public MyTree(T t){
        root = new TreeNode<>(t, null);
    }
    
    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        return (root == null);
    }

    @Override
    public MyIterator<Node<T>> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void preOrder(MyLinkedListIterable<Node<T>> iterable, Node<T> node) throws Exception{
        iterable.add(node);//ação de visitar o nodo
        MyIterator iter = ((TreeNode<T>) node).getChildren().iterator();
        while(iter.hasNext()){
            TreeNode<T> n = (TreeNode<T>) iter.next();
            preOrder(iterable, n);
        }
    }
    
    public void postOrder(MyLinkedListIterable<Node<T>> iterable, Node<T> node) throws Exception{
        MyIterator iter = ((TreeNode<T>) node).getChildren().iterator();
        while(iter.hasNext()){
            TreeNode<T> n = (TreeNode<T>) iter.next();
            postOrder(iterable, n);
        }
        iterable.add(node);//ação de visitar o nodo
    }

    @Override
    public MyIterable<Node<T>> positions() {
        
        MyLinkedListIterable<Node<T>> iterable = new MyLinkedListIterable<>();
        if (this.root != null){
            try {
                preOrder(iterable, root);
            } catch (Exception ex) {
            }
        }
        return iterable;
    }

    @Override
    public T replace(Node<T> v, T t) {
        T aux = v.getElement();
        ((TreeNode<T>) v).setElement(t);
        return aux;
    }

    @Override
    public Node<T> root() throws Exception {
        if (root == null){
            throw new Exception("Árvore vazia");
        }else{
            return root;
        }
    }

    @Override
    public Node<T> parent(Node<T> v) {
        return ((TreeNode<T>) v).getParent();
    }

    @Override
    public MyIterable<Node<T>> children(Node<T> v) {
        return ((TreeNode<T>) v).getChildren();
    }

    @Override
    public boolean isInternal(Node<T> v) {
        return !((TreeNode<T>) v).getChildren().isEmpty();
    }

    @Override
    public boolean isExternal(Node<T> v) {
        return ((TreeNode<T>) v).getChildren().isEmpty();
    }

    @Override
    public boolean isRoot(Node<T> v) {
        return (v == root);
    }

    @Override
    public Node<T> addNode(T t, Node<T> parent) throws Exception {
        
        if (parent == null && this.isEmpty()){
            root = new TreeNode<>(t, parent);
            return root;
        }else if (parent == null && !this.isEmpty()){
            throw new Exception("A árvore já possui uma raiz.");
        }else {
            TreeNode<T> newNode = new TreeNode<>(t, parent);
            ((TreeNode<T>) parent).getChildren().add(newNode);
            return newNode;
        }
    }
    
    public int depth(Node<T> v){
        if (this.isRoot(v)){
            return 0;
        }else{
            return 1 + depth(((TreeNode<T>) v).getParent());
        }
    }
    
    public int height1(){
        
        int h = 0;
        MyIterator<Node<T>> iter = this.positions().iterator();
        while(iter.hasNext()){
            try {
                Node<T> node = iter.next();
                if (this.isExternal(node)){
                    h = Math.max(h, this.depth(node));
                }
            } catch (Exception ex) {
            }
        }
        return h;
        
    }
    

    @Override
    public String toString() {
        return "MyTree{" + "root=" + root + '}';
    }
    
    
    
}
