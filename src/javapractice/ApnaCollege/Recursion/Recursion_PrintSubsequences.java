package AC.Recursion;

import java.util.HashSet;

/**
 *
 * @author V KUMAR
 */
public class Recursion_PrintSubsequences {
    public static void printSubsequence(String str, int idx, String newString,HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{            
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        
        //to be included
        printSubsequence(str, idx+1, newString+currChar, set);
        //or not to be included
        printSubsequence(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "abc";
        HashSet<String> set = new HashSet<>();
        printSubsequence(str, 0, "", set);
    }
}
