package aprendizado.estruturadedados.AulaED2608tree.src;

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
    public MyIterator<TreeNode<T>> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void percorrer(MyLinkedListIterator<TreeNode<T>> iterable, TreeNode<T> node) throws Exception{
        
        iterable.add(node);
        MyIterator iter = node.getChildren().iterator();
        while(iter.hasNext()){
            TreeNode<T> n = (TreeNode<T>) iter.next();
            if (!this.isExternal(n)){
                percorrer(iterable, n);
            }else{
                iterable.add(n);
            }
            
        }
        
        
    }

    @Override
    public MyIterable<TreeNode<T>> positions() {
        
        MyLinkedListIterator<TreeNode<T>> iterable = new MyLinkedListIterator<>();
        if (this.root != null){
            try {
                percorrer(iterable, root);
            } catch (Exception ex) {
            }
        }
        return iterable;
    }

    @Override
    public T replace(TreeNode<T> v, T t) {
        T aux = v.getElement();
        v.setElement(t);
        return aux;
    }

    @Override
    public TreeNode<T> root() throws Exception {
        if (root == null){
            throw new Exception("Árvore vazia");
        }else{
            return root;
        }
    }

    @Override
    public TreeNode<T> parent(TreeNode<T> v) {
        return v.getParent();
    }

    @Override
    public MyIterable<TreeNode<T>> children(TreeNode<T> v) {
        return v.getChildren();
    }

    @Override
    public boolean isInternal(TreeNode<T> v) {
        return !v.getChildren().isEmpty();
    }

    @Override
    public boolean isExternal(TreeNode<T> v) {
        return v.getChildren().isEmpty();
    }

    @Override
    public boolean isRoot(TreeNode<T> v) {
        return (v == root);
    }

    @Override
    public TreeNode<T> addTreeNode(T t, TreeNode<T> parent) throws Exception {
        
        if (parent == null && this.isEmpty()){
            root = new TreeNode<>(t, parent);
            return root;
        }else if (parent == null && !this.isEmpty()){
            throw new Exception("A árvore já possui uma raiz.");
        }else {
            TreeNode<T> newNode = new TreeNode<>(t, parent);
            parent.getChildren().add(newNode);
            return newNode;
        }
    }
    
    public int depth(TreeNode<T> v){
        if (this.isRoot(v)){
            return 0;
        }else{
            return 1 + depth(v.getParent());
        }
    }
    
    public int height1(){
        
        int h = 0;
        MyIterator<TreeNode<T>> iter = this.positions().iterator();
        while(iter.hasNext()){
            try {
                TreeNode<T> node = iter.next();
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
