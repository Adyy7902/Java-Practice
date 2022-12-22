package CodeWithHarry;

import java.util.Arrays;
import java.util.LinkedList;

public class CWH_92_LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>() ; //Linked list
        LinkedList<Integer> l2 = new LinkedList<>() ; 
        l2.add(15);// adding 15 in the list l2 at 0th index
        l2.add(18);
        l2.add(16);
        l2.add(19);
        l1.add(6); // adding 6 in the list l1 at 0th index
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(5);
        l1.add(0,5); // will add 5 at 0th index and shift every other elements in Linked list l1
        //l1.addAll(l2); // this will add elements of l2 at the end of the Linked list l1
        l1.addAll(0,l2); // this will add elements of l2 at 0th index of the Linked list l1
        System.out.println(l1.contains(5)); //checks if a given object is present in the list l1
        System.out.println(l1.containsAll(l2)); // check if all the elements of l2 are present in the list l1
        System.out.println(l1.indexOf(7));
        l1.set(9,4);
//        for (int i = 0; i < l1.size(); i++) {                               //l1.size() is used to get the size of the list l1
//            System.out.print(l1.get(i));   //l1.get() is used to return the element at specified location in  the list l1
//            System.out.print(", ");
//        }   
        System.out.println(l1);
    }
}
