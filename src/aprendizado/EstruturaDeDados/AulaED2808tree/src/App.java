package aprendizado.EstruturaDeDados.AulaED2808tree.src;

import java.util.Iterator;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        Tree<String> arquivos = new MyTree<String>();
        
        Node root = arquivos.addNode("/", null);
        
        arquivos.addNode("etc", root);
        
        Node home = arquivos.addNode("home", root);
        
        Node documents = arquivos.addNode("Documents", home);
        
        arquivos.addNode("Imagens", documents);
        
        arquivos.addNode("Downloads", home);
        
        System.out.println(arquivos);
        
        MyIterable<Node<String>> positions = arquivos.positions();
        MyIterator iter = positions.iterator();
        while(iter.hasNext()){
            TreeNode<String> node = (TreeNode<String>) iter.next();
            System.out.println(node.getElement());
        }
        
        
        MyTree<String> t = (MyTree<String>) arquivos;
        
        System.out.println(t.depth(root));
        System.out.println(t.height1());
        
        
        System.out.println("\nImprimindo em pre-order\n\n\n");
        MyLinkedListIterable<Node<String>> posPreOrder = 
                new MyLinkedListIterable<Node<String>>();
        t.preOrder(posPreOrder, root);
        
        iter = posPreOrder.iterator();
        while(iter.hasNext()){
            TreeNode<String> node = (TreeNode<String>) iter.next();
            System.out.println(node.getElement());
        }
        
        
        System.out.println("\nImprimindo em post-order\n\n\n");
        MyLinkedListIterable<Node<String>> posPostOrder = 
                new MyLinkedListIterable<Node<String>>();
        t.postOrder(posPostOrder, root);
        
        iter = posPostOrder.iterator();
        while(iter.hasNext()){
            TreeNode<String> node = (TreeNode<String>) iter.next();
            System.out.println(node.getElement());
        }
        
    }
    
}
