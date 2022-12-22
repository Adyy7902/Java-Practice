package javapractice.CodeWithHarry;
import java.util.Scanner;

public class CWH_19_PS4 {
    public static void main(String []args){
        /*
        //Question 1
        int a=10;
        if (a==11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }
        
        //Question 2
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks in Physics(out of 100):");
        m1 = sc.nextByte();
        
        System.out.print("Enter your marks in Chemistry(out of 100):");
        m2 = sc.nextByte();
        
        System.out.print("Enter your marks in Mathematics(out of 100):");
        m3 = sc.nextByte();
        
        float avg = (m1+m2+m3)/3f;
        System.out.println("Your Overall Percentage  is: " + avg);
        if (avg >40f && m1>33f && m2>33f && m3>33f){
            System.out.println("Congractulations, You have been promoted!");
        }
        else 
            System.out.println("Sorry, You have not been promoted!\nBetter Luck Next Time!");
        
        //Question 3 
        //Taking value of tax as 0
        float tax=0;
        //Inputting value of amount from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income of an employee(in lakhs) per annum: ");
        float income = sc.nextFloat();
        
        //if-else loop
        if (income<=2.5f){
            tax = tax + 0; //tax will be 0%
        }
        else if (income>2.5f && income <=5f){
            tax += 0.05*(income-2.5f);	//tax will be 5%
        }
        else if (income>5f && income <= 10f) {
            tax += 0.05*(5f-2.5f);	//tax will be first 5% for 2.5 - 5
            tax += 0.2*(income-5f);	//then tax will be 20% for 5 - 10
        }
        else if (income >10f){
            tax += 0.05*(5f-2f);	//tax will be first 5% for 2.5 - 5
            tax += 0.2*(10f-5f);	//then tax will be 20% for 5 - 10
            tax+= 0.3*(income-10f);	//then at last tax will be 30% for 10 onwards
        }
        System.out.println("Income tax paid by the employee per annum is: " + tax*100000);
        
        //Question 4
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check it's corresponding day: ");
        int day = sc.nextInt();
            
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        //Question 5
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
	int year = sc.nextInt();
	if(year%100==0){
            year/=100;
            if(year%4==0){
                System.out.println("Year is a Leap Year.");
            }
            else{
                System.out.println("Year is not a Leap Year");
            }
	}
	else {
            if(year%4==0){
                System.out.println("Year is a Leap Year.");
            }
            else{
                System.out.println("Year is not a Leap Year");
            }
	}
        
        //Question 6
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the website link: ");
        String website = sc.next();
        if(website.endsWith(".org"))
            System.out.println("This is an Organizational website");
        else if(website.endsWith(".com"))
            System.out.println("This is a Commercial website");
        else if(website.endsWith(".in"))
            System.out.println("This is an Indian website");
        else
            System.out.println("Not known!!");
        */
    }
}
