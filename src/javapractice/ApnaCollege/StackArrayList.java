package javapractice.ApnaCollege;

import java.util.ArrayList;

/**
 *
 * @author V KUMAR
 */
public class StackArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        
        //a boolean function to check if the stack is Empty or not
        public static boolean isEmpty(){
            return list.size() == 0;  //will return true if head is null else will return false
        }
        
        //add data to the top of stack
        public static void push(int data){
            list.add(data);
        }
        
        //remove from top of the stack
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()- 1);
            list.remove(list.size()- 1);
            return top;
        }
        
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
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
