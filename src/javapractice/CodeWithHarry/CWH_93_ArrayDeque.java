package CodeWithHarry;

import java.util.ArrayDeque;
import java.util.Arrays;

public class CWH_93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(6);
        ad.add(56);
        ad.add(9);
        ad.add(7);
        ad.addFirst(1);
//        for (int i = 0; i < ad.size(); i++) {
            System.out.println(ad);
//        }
    }
}
