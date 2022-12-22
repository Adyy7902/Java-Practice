package AC.Recursion;

/**
 *
 * @author V KUMAR
 */
public class Recursion_WordReversal {
    public static void  wordReversal(String str, int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        wordReversal(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        int idx = str.length()-1;
        wordReversal(str,idx);
    }
}
