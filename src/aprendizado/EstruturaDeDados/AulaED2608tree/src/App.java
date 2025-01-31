package aprendizado.EstruturaDeDados.AulaED2608tree.src;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        Tree<String> arquivos = new MyTree<String>();
        
        TreeNode root = arquivos.addTreeNode("/", null);
        
        arquivos.addTreeNode("etc", root);
        
        TreeNode home = arquivos.addTreeNode("home", root);
        
        TreeNode documents = arquivos.addTreeNode("Documents", home);
        
        arquivos.addTreeNode("Imagens", documents);
        
        arquivos.addTreeNode("Downloads", home);
        
        System.out.println(arquivos);
        
        MyIterable<TreeNode<String>> positions = arquivos.positions();
        MyIterator iter = positions.iterator();
        while(iter.hasNext()){
            TreeNode<String> node = (TreeNode<String>) iter.next();
            System.out.println(node.getElement());
        }
        
        
        MyTree<String> t = (MyTree<String>) arquivos;
        
        System.out.println(t.depth(root));
        System.out.println(t.height1());
    }
    
}
