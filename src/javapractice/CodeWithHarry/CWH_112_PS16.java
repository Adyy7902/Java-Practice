package CodeWithHarry;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author V KUMAR
 * @since 2022
 * @version 2.01
 */
//Question 2
class MyDepricated{
    /**
     * @deprecated 
     */
    @Deprecated
    void meth(){
        System.out.println("I am a depricated method");
    }
}

@FunctionalInterface
interface anInterface{
    void display();
}
public class CWH_112_PS16 {
    //Question 3
    @SuppressWarnings("depricated")
    public static void main(String[] args) {
        /*
        //Question 2
        MyDepricated md = new MyDepricated();
        md.meth();
        
        //Question 4
        anInterface ai = new anInterface() {
            @Override
            public void display() {
                System.out.println("This is the display method of Anonymous Inner Class");            }
        };
        ai.display();                
        
        //Question 5 
        File myFile = new File("Multiplication Table.txt");
        try{
            myFile.createNewFile();
        }catch(IOException e){
            System.out.println("Unable to create the file");
            e.printStackTrace();
        }
        try{
            FileWriter fw = new FileWriter(myFile);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to find its multiplication table: ");
            int a = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                fw.write(a + " * " + i + " = " + a*i + "\n");
                
            }
            fw.close();
        }catch(IOException e){
            System.out.println("Cannot write to this file");
            e.printStackTrace();
        }
        */
        //Question 6
        File myFile = new File("Multiplication Table2.txt");
        try{
            myFile.createNewFile();
        }catch(IOException e){
            System.out.println("Unable to create the file");
            e.printStackTrace();
        }
        try{
            FileWriter fw = new FileWriter(myFile);
            for (int i = 2; i <= 9; i++) {
                for (int j = 1; j <= 10; j++) {
                    fw.write(i + " * " + j + " = " + i*j + "\n");               
                }  
                fw.write("\n");
            }
            fw.close();
        }catch(IOException e){
            System.out.println("Cannot write to this file");
            e.printStackTrace();
        }
    }
}
