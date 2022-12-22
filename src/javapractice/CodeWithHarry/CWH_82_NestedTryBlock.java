package CodeWithHarry;

import java.util.Scanner;

public class CWH_82_NestedTryBlock {
    public static void main(String[] args) {
        int [] marks = new int [3];
        marks[0] = 7;
        marks[1] = 23;
        marks[2] = 5;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.print("Enter the value of index: ");
            int ind = sc.nextInt();
            try{
                System.out.println("Going into inner try loop...");
                try{
                    System.out.println(marks[ind]); //If exception occurs then the next line won't be printed
                    flag = false; //If the exception doesn't occur, the flag will be set to false and it will come out of the while loop
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry the index doesn't exist!");
                    System.out.println("Exception in level 2!");
                }
            }catch(Exception e){
                System.out.println("Exception in level 1!");
            }   
        }
        System.out.println("Thanks for using this program!");
    }
}
