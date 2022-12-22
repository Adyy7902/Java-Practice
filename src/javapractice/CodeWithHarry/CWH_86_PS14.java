package CodeWithHarry;

import java.util.Scanner;

class MaxRetriesException extends Exception{

    @Override
    public String toString() {
        return "Max retries attempted"; 
    }
    @Override
    public String getMessage() {
        return "Max retries attempted";
    }
}
public class CWH_86_PS14 {
    //Problem 5
    public static void error(int i) throws MaxRetriesException{
        if (i>=5) {
                System.out.println("Error");
                
                try{
                    throw new MaxRetriesException();
                }catch(MaxRetriesException e){
                    System.out.println(e.getMessage());
                }
        }
    }
    public static void main(String[] args) {
        /*
        //Problem 1
        //Syntax error -> int a =7
        //Logical error -> 
        int age = 50;
        int year_born = 2000-50;
       //Runtime error
        System.out.println(6/0);
        
        //Problem 2 
        try{
            int a=666/0;
            
        }catch (IllegalArgumentException e){
            System.out.println("Hehe");
        }
        catch(ArithmeticException e){
            System.out.println("Haha");
        }
        
        // Problem 3 and 4
        boolean flag = true;
        int [] marks = new int [3];
        marks[0]=2;
        marks[1]=23;
        marks[2]=52;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while (flag && i<5) {
            try{
                System.out.print("Enter the valid of index: ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is : " + marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid Index");
                i++;
            }  
        }
        if (i>=5) {
                System.out.println("Error");
                
                //Problem 4
                try{
                    throw new MaxRetriesException();
                }catch(MaxRetriesException e){
                    System.out.println(e.getMessage());
                }
        }
        */
        //Problem 5
        boolean flag = true;
        int [] marks = new int [3];
        marks[0]=2;
        marks[1]=23;
        marks[2]=52;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while (flag && i<5) {
            try{
                System.out.print("Enter the valid of index: ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is : " + marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid Index");
                i++;
            }  
        }
        try{
            error(i);
        }catch (MaxRetriesException e){
            System.out.println(e.getMessage());
        }

        
    }
}
