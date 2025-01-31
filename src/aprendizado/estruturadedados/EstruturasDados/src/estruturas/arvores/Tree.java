package aprendizado.estruturadedados.EstruturasDados.src.estruturas.arvores;

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
    public MyIterator<Node<T>> iterator();
    
    /**
     * 
     * @return uma coleção iterável de nodos
     */
    public MyIterable<Node<T>> positions();
    
    /**
     * 
     * @param v
     * @param t
     * @return o valor que estava armazenado anteriormente
     */
    public T replace(Node<T> v, T t);
    
    /**
     * 
     * @return a raiz da árvore
     */
    public Node<T> root() throws Exception;
    
    /**
     * 
     * Não esquecer de exemplificar a relevância dos métodos
     * parent e children (visibilidade)
     * 
     * @param v
     * @return o pai do nodo v
     */
    public Node<T> parent(Node<T> v);
    
    /**
     * 
     * @param v
     * @return os filhos de um nodo em um iterável
     */
    public MyIterable<Node<T>> children(Node<T> v);
    
    /**
     * 
     * @param v
     * @return se o nodo é interno
     */
    public boolean isInternal(Node<T> v);
    
    /**
     * 
     * @param v
     * @return se o nodo é externo, ou seja, uma folha
     */
    public boolean isExternal(Node<T> v);
    
    /**
     * 
     * @param v
     * @return se v é a raiz da árvore
     */
    public boolean isRoot(Node<T> v);
    
    /**
     * 
     * @param t
     * @param parent
     * @return o novo nodo criado com o valor T e pai parent
     * @throws Exception 
     */
    public Node<T> addNode(T t, Node<T> parent) throws Exception;
}
