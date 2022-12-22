package javapractice.ApnaCollege;

/**
 *
 * @author V KUMAR
 */
public class BinaryTree_DiameterOfTree {
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
    static class TreeInfo{
        int height;
        int diameter;

        public TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }
    
    public static TreeInfo diameter2(Node root){
        
        if(root == null){
            return new TreeInfo(0, 0); 
        }
        
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        int myHeight = Math.max(left.height,right.height)+1;
        
        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height+right.height+1;
        int myDiameter = Math.max(diam3, Math.max(diam2, diam1));
        
        TreeInfo newInfo = new TreeInfo(myHeight,myDiameter);
        return newInfo;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinTree tree = new BinTree();
        Node root = tree.buildTree(nodes);
        
        System.out.println("Height of Tree:" + diameter2(root).height);
        System.out.println("Diameter of Tree:" + diameter2(root).diameter);
    }
}
