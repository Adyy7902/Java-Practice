package javapractice.CodeWithHarry;

public class CWH_32_MethodOverloading {
    //Method Overloading
    static void  change (int a){ //copy of integer is passed as parameter 
        a=98;
    }
    static void change (int [] arr){ //copy of reference is passed as parameter
        arr[0]=98;
    }
    public static void main(String[] args) {
        
        //Changing Integer - Integer will remain the same
        int a = 45;
        change(a);
        System.out.println("The value of a after changing is: " + a);
        
        //Changing array - Array will change as the reference of array is passed as parameter
        int [] marks = {12,38,24,46,53};
        change(marks);
        //Arguments are actual!
        System.out.println("Value of marks[0] after changing is: " + marks[0]);
    }
}
