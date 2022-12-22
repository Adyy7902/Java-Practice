package javapractice.CodeWithHarry;

import java.util.Random;
import java.util.Scanner;

public class CWH_20_RockPaperScissorsGame {
    public static void main(String[] args) {
        //0 for rock 
        //1 for paper
        //2 for scissors
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for rock, 2 for paper, 3 for scissors :");
        int userInput = sc.nextInt();
        
        Random r = new Random();
        int computerInput = r.nextInt(4-1);
        
        if(userInput == computerInput){
            System.out.println("Draw");
        }
        else if(userInput == 1 && computerInput == 3||userInput == 2 && computerInput == 1 ||userInput == 3 && computerInput == 2 )
        {
            System.out.println("You Win!!");
        }
        else{
            System.out.println("Computer Win!!");
        }
        System.out.print("Computer Choice: ");
        switch (computerInput) {
            case 1 -> System.out.println("Rock");
            case 2 -> System.out.println("Paper");
            default -> System.out.println("Scissors");
        }
    }
}
