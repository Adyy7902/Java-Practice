package javapractice.ApnaCollege.Recursion;

/**
 *
 * @author V KUMAR
 */
//Time complexity -> O(n!) 
public class Recursion_Permutation {
    public static void printPerm(String str, String perm){
        
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPerm(newStr, perm + currChar);
        }
    }
    public static void printRev(String str , int indx) {
        if(indx == 0){
            System.out.println(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        printRev(str, indx-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        //Printing
        //printPerm(str , "");
        printRev(str , str.length()-1);
    }
}
