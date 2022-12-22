package javapractice.CodeWithHarry;

import java.io.File;

public class CWH_111_FileHandling {
    public static void main(String[] args) {
        /*
        // Code to create new file
        File myFile = new File("MyNewFile.txt");
        try {
            myFile.createNewFile();
        } catch (IOException ex) {
            System.out.println("Unable to create this file");
            ex.printStackTrace();
        }
            
            //Code to write to a file
        try{
            FileWriter f = new FileWriter("MyNewFile.txt");
            f.write("This is our first file from this java course \nOkay now bye.");
            f.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }   
        
        //Reading a file
        File myFile = new File("MyNewFile.txt");
        try{
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(IOException e){
            System.out.println("Unable to read from the file");
            e.printStackTrace();
        }
        */
        File myFile = new File("MyNewFile.txt");
        if(myFile.delete()){
            System.out.println("I have deleted " + myFile.getName());
        }
        else{
            System.out.println("Some error occured while deleting the file");
        }
    }
}
