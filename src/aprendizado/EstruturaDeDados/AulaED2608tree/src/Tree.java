package aprendizado.EstruturaDeDados.AulaED2608tree.src;

public interface Tree<T>{
    
    /**
     * 
     * @return o tamanho da árvore. O total de nodos
     */
    public int size();
    
    /**
     * 
     * @return se a árvore está vazia
     */
    public boolean isEmpty();
    
    /**
     * 
     * @return um iterador de tree nodes
     */
    public MyIterator<TreeNode<T>> iterator();
    
    /**
     * 
     * @return uma coleção iterável de nodos
     */
    public MyIterable<TreeNode<T>> positions();
    
    /**
     * 
     * @param v
     * @param t
     * @return o valor que estava armazenado anteriormente
     */
    public T replace(TreeNode<T> v, T t);
    
    /**
     * 
     * @return a raiz da árvore
     */
    public TreeNode<T> root() throws Exception;
    
    /**
     * 
     * Não esquecer de exemplificar a relevância dos métodos
     * parent e children (visibilidade)
     * 
     * @param v
     * @return o pai do nodo v
     */
    public TreeNode<T> parent(TreeNode<T> v);
    
    /**
     * 
     * @param v
     * @return os filhos de um nodo em um iterável
     */
    public MyIterable<TreeNode<T>> children(TreeNode<T> v);
    
    /**
     * 
     * @param v
     * @return se o nodo é interno
     */
    public boolean isInternal(TreeNode<T> v);
    
    /**
     * 
     * @param v
     * @return se o nodo é externo, ou seja, uma folha
     */
    public boolean isExternal(TreeNode<T> v);
    
    /**
     * 
     * @param v
     * @return se v é a raiz da árvore
     */
    public boolean isRoot(TreeNode<T> v);
    
    /**
     * 
     * @param t
     * @param parent
     * @return o novo nodo criado com o valor T e pai parent
     * @throws Exception 
     */
    public TreeNode<T> addTreeNode(T t, TreeNode<T> parent) throws Exception;
}
