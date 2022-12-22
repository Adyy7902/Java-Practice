package javapractice.CodeWithHarry;

public class CWH_27_ArrayOperations {
    public static void main(String[] args) {
        /*
        float [] marks = {100,90,76,95,94};
        String [] students = { "Aditya", "Dhruv" , "Kinshuk" }; 
        System.out.println(students[1]);
        */
        int [] marks = {100,90,76,95,94};
        
        //System.out.println(marks[1]);
        //System.out.println(marks.length);
        System.out.println("Array elements:- ");
        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]); //Array Traversal
        }
        //Elements of array in reverse order
        System.out.println("Reversed:- ");
        for(int i=marks.length-1; i>0 ;i--){
            System.out.println(marks[i]);
        }
        
        //for-each loop
        System.out.println("Using For-Each Loop:- ");
        for(int elem : marks){
            System.out.println(elem);
        }
        
        
    }
}
