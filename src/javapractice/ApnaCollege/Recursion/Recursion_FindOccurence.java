package AC.Recursion;

/**
 *
 * @author V KUMAR
 */

//To find the occurence first and the last index of a given character
public class Recursion_FindOccurence {
    public static int first = -1;
    public static int last = -1;
    public static void findOccurence(String str, int indx , char element) {
        if(indx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currElem = str.charAt(indx);
        if(currElem == element){
            if(first == -1){
                first = indx;
            }
            else{
                last = indx;
            }
        }
        findOccurence(str, indx+1, element);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurence(str, 0, 'a');
    }
}
