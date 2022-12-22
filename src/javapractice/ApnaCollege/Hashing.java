package javapractice.ApnaCollege;

import java.util.HashSet;
/**
 *
 * @author V KUMAR
 */
public class Hashing {
    public static void main(String[] args) {
        //Declaration
        HashSet<Integer> set = new HashSet<>();
        
        //Insert - add()
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        
        //Search - contains()
        if(set.contains(1)){
            System.out.println("Set contains element!!");
        }else{
            System.out.println("Set doesn't contain element!!");
        }
        
        //Delete - remove()
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Removed the element 1!!");
        }
        
        //Size
        System.out.println(set.size());
         
    }
}
