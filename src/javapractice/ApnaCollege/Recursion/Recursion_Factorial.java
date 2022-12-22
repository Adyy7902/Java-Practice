package javapractice.ApnaCollege.Recursion;

/**
 *
 * @author V KUMAR
 */
public class Recursion_Factorial {
    public static void voidFactorial(int n, int fact) {
        if(n==0){
            fact *= 1;
            System.out.println(fact);
            return;
        } 
        fact *= n;
        voidFactorial(n-1,fact);
    }
    public static int intFactorial(int n) {
        if(n==1 || n==0){
            return 1;
        } 
        int calcnm1 = intFactorial(n-1);
        int fact = n* calcnm1;
        return fact;
    }
    public static void main(String[] args) {
        voidFactorial(5,1);
        System.out.println(intFactorial(5));
    }
}
