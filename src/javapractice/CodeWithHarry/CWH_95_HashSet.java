package javapractice.CodeWithHarry;

import java.util.HashSet;

public class CWH_95_HashSet {
    public static void main(String[] args) {
//        HashSet<Integer> hs1 = new HashSet<>(); // Initial capacity 16
        HashSet<Integer> hs1 = new HashSet<>(6,0.5f); // 6 - Initial Capacity and 0.5f - Load factor in float 
        hs1.add(6);
        hs1.add(8);
        hs1.add(11);
        hs1.add(11);
        hs1.add(3);
        System.out.println(hs1);
        
    }
}
