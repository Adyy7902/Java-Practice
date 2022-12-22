package CodeWithHarry;

import java.util.Scanner;

class MyExc extends Exception{

    @Override
    public String toString() {
        return "I am toString()";
    }
    
    @Override
    public String getMessage() {
        return "I am getMessage()";
    }    
}
        
public class CWH_83_CustomException {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = sc.nextInt();
        if(a<99){
            try {
                throw new MyExc();
            } catch (MyExc ex) {
                System.out.println(ex.getMessage());
                System.out.println(ex.toString());
                ex.printStackTrace(); //The program hasn't ended here. It is just showing the Stack Trace of the Exception occured
                System.out.println("Finished");
            }
        }
    }
}
