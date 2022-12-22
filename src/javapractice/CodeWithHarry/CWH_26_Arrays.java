package javapractice.CodeWithHarry;

public class CWH_26_Arrays {
    public static void main(String[] args) {
        /* Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1.Create 500 variables
        2.Use Arrays(recommended)
        */
        int [] marks = new int[5]; // declaration and memory allocation at same line
        int [] mark1; // declation
        mark1 = new int[6]; // memory allocation
        int [] mark2 = {100,90,76,95,94}; // declare + initialize
        //Initialization
        marks[0]=100;
        marks[1]=90;
        marks[2]=76;
        marks[3]=95;
        marks[4]=94;
        mark1[4]=94;
        
        System.out.println(marks[4]);
        System.out.println(mark1[4]);
        System.out.println(mark2[2]);
    }
}
