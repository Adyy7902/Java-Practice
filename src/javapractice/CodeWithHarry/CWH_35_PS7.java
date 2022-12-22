package javapractice.CodeWithHarry;
import java.util.Scanner;

public class CWH_35_PS7 {
    /*
    //Question 1 - Multiplication Table
    static void mul(int a){
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d \n" ,a ,i ,(a*i));
        }
    }
    //Question 2 - Print the pattern
    /*
        *
        **
        ***
        ****
    */
    /*
    static void repeat(char ch){
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println("");
        }
    }
    
    //OR
    //Question 2 - Print the pattern
    /*
        *
        **
        ***
        ****
    */
    /*
    static void repeat(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    //Question 3 - sum of First n natural using Recursion
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
    
    //Question 4
    static void pattern(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    //Question 5 - Function to print nth term of fibonacci series
    static int fib(int n){
        
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        
        //OR instead of using these 2 if and else if statements we can use the following
        if(n==1||n==2){
            return n-1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    
    //Question 6 - Find average of set of number passed as arguments
    static int sum(int ...arr){
        int sum = 0;
        for (int i :arr){
            sum += i;
        }
        return sum;
    }
    
    //Question 7 - Repeat Question 4 with Recursion
    static void repeatRec(int n){
        if(n>0){
            //first rest is called the next will print
            //repeatRec(4-1) -> repeatRec(3-1) -> repeatRec(2-1) -> repeatRec(1-1)
            // then repeatRec(1) - *
            // then repeatRec(2) - **
            // then repeatRec(3) - ***
            // then repeatRec(4) - ****
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println("");
            repeatRec(n-1);
        }
    }
    
    //Question8 - Repeat Question 2 with Recursion 
    static void repeatRec(int n){
        if(n>0){
            repeatRec(n-1);//first rest is called the next will print
            //repeatRec(4-1) -> repeatRec(3-1) -> repeatRec(2-1) -> repeatRec(1-1)
            // then repeatRec(4) - ****
            // then repeatRec(3) - ***
            // then repeatRec(2) - **
            // then repeatRec(1) - *
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    //Question 9 - Celcius to Fahrenheit
    static float celToFar(int cel){
        float far = (cel*9/5f)+32f;
        return far;
    }
    */
    //Question 10 - Question 3 using Iterative
    static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }
    //
    public static void main(String[] args) {
        /*
        //Question 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get it's multiplication table: ");
        int n = sc.nextInt();
        mul(n);
        
        //Question 2
        Scanner sc = new Scanner(System.in);
        
        //For first part we take character as argument
        System.out.println("Enter a character to see its lower triangle formation: ");
        repeat('*');
        
        //For OR part we take number of repetitions as argument
        repeat(4);
        
        //Question 3
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of first n Natural Numbers is: " + sum(n));

        //Question 4
        System.out.println("");
        pattern(4);
        
        //Question 5
        System.out.println(fib(5));
        
        //Question 6
        System.out.println("Sum of 2, 3, 4 and 5 is: " +sum(2,3,4,5));
        
        //Question 7
        System.out.println(patternRecursion(4));
        
        //Question 8
        repeatRec(4);
        
        //Question 9
        System.out.println("33°C = " + celToFar(33) + "°F");
        */
        //Question 10
        System.out.println("The sum of first 10 natural numbers is: " + sum(10));
        
    }
}
