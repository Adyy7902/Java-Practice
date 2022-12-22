package javapractice.ApnaCollege;

/**
 *
 * @author V KUMAR
 */
public class StackLinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }   
    }
    static class Stack {
        public static Node head;
        
        //a boolean function to check if the stack is Empty or not
        public static boolean isEmpty(){
            return head == null;  //will return true if head is null else will return false
        }
        
        //add data to the top of stack
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            
            newNode.next = head;
            head = newNode;
        }
        
        //remove from top of the stack
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            
            int top = head.data;
            head = head.next;
            return top;
        }
        
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
