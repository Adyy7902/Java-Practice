package javapractice.ApnaCollege;

/**
 *
 * @author V KUMAR
 */
public class BinaryTree_HeightAndDiameterOfTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }     
    }
    
    static class BinTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }        
    }
    
    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        
        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        
        return myHeight;
    }
    
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = heightOfTree(root.left)+heightOfTree(root.right)+1;
        
        return Math.max(dia3, Math.max(dia2, dia1));
    }
    
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinTree tree = new BinTree();
        Node root = tree.buildTree(nodes);
        
        System.out.println("Height of the Tree: " + heightOfTree(root));
        System.out.println("Diameter of the Tree: " + diameter(root));
    }
}
