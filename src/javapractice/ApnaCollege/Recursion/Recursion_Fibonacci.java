package javapractice.ApnaCollege.Recursion;

/**
 *
 * @author V KUMAR
 */
public class Recursion_Fibonacci {
    public static void printFibb(int a, int b, int n) {
        if(n==0){
            return;
        }
        int c = b+a;
        System.out.println(c);
        printFibb(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0, b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        printFibb(a, b, n-2);
        
    }
}
