package javapractice.CodeWithHarry;

//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Date;
import java.util.HashSet;

public class CWH_102_PS15 {
    public static void main(String[] args) {
        /*
        //Question 1 
        ArrayList stud = new ArrayList();
        stud.add("Student 1");
        stud.add("Student 2");
        stud.add("Student 3");
        stud.add("Student 4");
        stud.add("Student 5");
        stud.add("Student 6");
        stud.add("Student 7");
        stud.add("Student 8");
        stud.add("Student 9");
        stud.add("Student 10");
        for(Object a:stud){
            System.out.println(a);
        }
        
        //Question 2
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
        
        //Question 3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        //Question 4
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        String myTime = dt.format(dtf);
        System.out.println(myTime);
        */
        //Question 5
        HashSet <Integer> s = new HashSet<>();
        s.add(6);
        s.add(14);
        s.add(20);
        s.add(36);
        s.add(36);
        System.out.println(s);
        
    }
}
