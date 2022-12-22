package javapractice.CodeWithHarry;
import java.util.Scanner;

public class CWH_34_Recursion { //A function in java can call itself. Such calling of function by itself is called "Recursion".
    /*
    //Factorial funtion using recursion
    static int fact(int n){
        //factorial(n) = n*(n-1)*(n-2)* .... *1
        //factorial(n) = n*factorial(n-1) a
        if(n==0 || n==1 ){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    //Factorial function using iteration
    static int fact_iter(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int fact = 1;
            for (int i = 1; i <= n; i++) { // i = 1 to n
                fact *= i;
            }
            return fact;
        }
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 0 is: " + fact(0)); 
        System.out.println("Factorial of 0 is: " + fact_iter(0)); 
    }
    */
    //Fabonacci series
    static void fabonacci(int n){
        int a= 0;
        int b= 1;
        int c ;
        switch (n) {
            case 1 -> System.out.println(a);
            case 2 -> System.out.println(a + ", " + b);
            default -> {
                    System.out.print(a + ", " + b);
                    for (int i = 2; i < n; i++) {
                            c = a + b;
                            a = b;
                            b = c;
                            System.out.print(", " + c);
                            }   System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of values to be printed in fabonacci series: ");
        int n = sc.nextInt();
        fabonacci(n);
    }
}
