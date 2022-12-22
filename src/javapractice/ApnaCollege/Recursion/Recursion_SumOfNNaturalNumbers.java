package AC.Recursion;

/**
 *
 * @author V KUMAR
 */
public class Recursion_SumOfNNaturalNumbers {
    public static void sumOfNNaturalNumbers(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        
        sum += i;
        sumOfNNaturalNumbers(i+1, n, sum);
    }
    public static void main(String[] args) {
        
        sumOfNNaturalNumbers(1,5,0);
        
    }
}
