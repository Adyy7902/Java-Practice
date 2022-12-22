package javapractice.ApnaCollege.Recursion;

/**
 *
 * @author V KUMAR
 */
public class Recursion_CallGuests {
    public static int callWays(int n) {
        if(n<=1){
            return 1;
        }
        //single
        int ways1 = callWays(n-1);
        //pair        
        int ways2 = (n-1)*callWays(n-2);
        
        return ways1+ways2;
    }            
    public static void main(String[] args) {
        int n=4;
        System.out.println("Number of ways to call guests in party in single or pair form are: " + callWays(n));
    }
}
