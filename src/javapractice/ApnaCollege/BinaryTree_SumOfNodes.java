package AC;

/**
 *
 * @author V KUMAR
 */
public class BinaryTree_SumOfNodes {
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
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        
        int leftSum =  sumOfNodes(root.left);
        int rightSum =  sumOfNodes(root.right);
        
        return leftSum + rightSum + root.data;
    }
    
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinTree tree = new BinTree();
        Node root = tree.buildTree(nodes);
        
        System.out.println("Sun of all the Nodes in the Tree: " + sumOfNodes(root));
    }
}
