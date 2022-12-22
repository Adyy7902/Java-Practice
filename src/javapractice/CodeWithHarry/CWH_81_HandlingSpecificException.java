package CodeWithHarry;

import java.util.Scanner;

public class CWH_81_HandlingSpecificException {
    public static void main(String[] args) {
        int [] marks = new int [3];
        marks[0] = 7;
        marks[1] = 23;
        marks[2] = 5;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int index = sc.nextInt();
        
        System.out.println("Enter a number you want to divide the value with: ");
        int number = sc.nextInt();
        try{
            System.out.println("Value at index entered is: " + marks[index]);
            System.out.println("The value of array value divided by the number is: " + marks[index]/number);
        }
        //Multiple catch block for a single try block
        catch(ArithmeticException e){ 
            System.out.println("ArithmeticException Occured!");
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occured!");
            System.out.println(e);
        }catch(Exception e){
            System.out.println("Some Exception Occured!");
            System.out.println(e);
        }
    }
}
