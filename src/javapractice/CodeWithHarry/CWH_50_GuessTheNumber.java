package CodeWithHarry;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int computerGuess;
    public int inputNumber;
    public int noOfGuesses = 0;

    Game() {
        Random r = new Random();
        this.computerGuess = r.nextInt(100);
    }
    
    void takeUserInput(){
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==computerGuess){
            System.out.println("Yes you guessed it right, it was " + computerGuess);
            System.out.println("You guessed it in " + noOfGuesses + " attempts");
            return true;
        }
        
        else if(inputNumber > computerGuess ){
            System.out.println("Too High...");
        }
        
        else if(inputNumber < computerGuess ){
            System.out.println("Too Low...");
        }
        
        return false;
    }
    
}
public class CWH_50_GuessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
