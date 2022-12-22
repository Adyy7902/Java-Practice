package AC;

import java.util.ArrayList;

/**
 *
 * @author V KUMAR
 */
public class BinarySearchTree {
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
    
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        
        if(root.data > val){
            //left subtree
            root.left = insert(root.left,val);
        }
        else{
            //right subtree
            root.right = insert(root.right,val);
        }
        return root;
    }
    
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        else if(root.data == key){
            return true;
        }
        else{
           return search(root.right, key); 
        }
    }
    
    public static Node delete(Node root, int val){
        if(root == null){
            return null;
        }
        
        if(root.data > val){
            root.left = delete(root.left,val);
        }
        else if(root.data == val){
            //case 1 - if the node is leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2 - if node has 1 child node
            if(root.left == null){
                return root.left;
            }
            else if(root.right == null) {
                return root.right;
            }
            
            //case 3 - if node has 2 child nodes
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);
            
        }
        else{
            root.right = delete(root.right , val);
        }
        return root;
    }
    
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    
    public static void printInRange(Node root, int X, int Y){
        if(root == null){
            return;
        }
        if(root.data >= X && root.data <= Y){
            printInRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printInRange(root.right, X, Y);
        }
        else if(root.data >= Y){
            printInRange(root.left, X, Y);
        }
        else{
            printInRange(root.right, X, Y);
        }
    }
    
    public static void printPath(ArrayList<Integer> path){
        System.out.print("Path: ");
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println("");
    }
    
    public static void rootToLeafPaths(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        
        //leaf node
        if(root.left == null && root.right == null){
            printPath(path);
        }
        else{ //non-aleaf node
            rootToLeafPaths(root.left, path);
            rootToLeafPaths(root.right, path);
        }
        path.remove(path.size()-1);
    }
    
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        
        for (int i = 0; i < values.length; i++) {
            root = insert(root,values[i]);
        }
        
//        inorder(root);
//        System.out.println("");
//        
//        delete(root, 5);
//        inorder(root);
//        System.out.println("");
//        printInRange(root, 3, 12);
//        System.out.println("");
        rootToLeafPaths(root, new ArrayList<>());
    }
}
