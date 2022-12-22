package javapractice.Threads;

import java.util.*;

public class ReverseNumber {

    public static void main(String[] args) {
        int r = 0;
        System.out.println("Enter a Number");
        Scanner myObj = new Scanner(System.in);
        int inp = myObj.nextInt();
        while (inp != 0) {
            int num = inp % 10;
            r = r * 10 + num;
            inp /= 10;
        }
        System.out.println("Reverse number is:- " + r);
        myObj.close();
    }
}