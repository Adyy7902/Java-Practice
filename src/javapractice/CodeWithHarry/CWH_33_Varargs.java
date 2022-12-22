package javapractice.CodeWithHarry;

public class CWH_33_Varargs {
    /* 
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
    */
    //Instead of creating multiple overloaded methods (like above), we will use varargs
    static int sum( int ...arr) {  //array will store the value of all the parameters of 'int' type 
        //Available as int [] arr
        int result = 0;
        for(int a : arr){
            result +=a;  //for each loop will calculate the result by adding all the 'int' variables
        }
        return result;
    }
    
    //If you want to get atleast one argument, just add another argument
    static int mul(int x, int ...arr){ //now 1 argument is compulsory and 1 is variable
        int mul = x;
        
        for(int a : arr){
            mul *= a;
        }
        return mul;
    }
    
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.println("Welcome to Varargs  Tutorial!");
        System.out.println("The sum of Nothing is: " + sum()); //sum can also have 0 arguments
        System.out.println("The sum of a and b is: " + sum(a,b));
        System.out.println("The sum of a, b and c is: " + sum(a,b,c));
        System.out.println("The sum of a, b, c and d is: " + sum(a,b,c,d));
        System.out.println("The product of a is: " + mul(a)); // mul need to have atleast 1 argument
        System.out.println("The product of a and b is: " + mul(a,b));        
        System.out.println("The product of a, b and c is: " + mul(a,b,c));
        System.out.println("The product of a, b, c and d is: " + mul(a,b,c,d));
    }
}
