package javapractice.ApnaCollege;

/**
 *
 * @author V KUMAR
 */
public class LinkedListLL {
    Node head;
    private int size;

    LinkedListLL() {
        this.size = 0;
    }
    
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }
    //add last
    public void  addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        Node currNode = head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next = newNode;
    }
    
    public void printList(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    //delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    //delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        
        Node secondLastNode = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLastNode=secondLastNode.next;
        }
        secondLastNode.next=null;
    }

    public int getSize() {
        return size;
    }
    public void reverseIterate(){
        if(head==null||head.next==null  ){
            return;
        }
        
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next=prevNode;
            
            //update
            
            prevNode= currNode;
            currNode=nextNode;
        }
        head.next=null;
        head = prevNode;
    }
    public Node reverseRecursion(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newHead = reverseRecursion(head.next);
        head.next.next=head;
        head.next = null;
        
        return newHead;
    }
    
    public static void main(String[] args) {
        LinkedListLL list = new LinkedListLL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("This");
        list.printList();
        list.reverseIterate();
        list.printList();
        list.head=list.reverseRecursion(list.head);
        list.printList();
    }
}
