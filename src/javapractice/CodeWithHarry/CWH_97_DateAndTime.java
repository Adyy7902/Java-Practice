package javapractice.CodeWithHarry;

import java.util.Date;

public class CWH_97_DateAndTime {
    public static void main(String[] args) {
        //Question - Is it safe to save the no of ms passed in a variable of type long?
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        
        System.out.println(d.getTime());
        System.out.println(d.getDate());  //Depricated
        System.out.println(d.getDay());  //Depricated
        System.out.println(d.getMonth());  //Depricated
        System.out.println(d.getYear()+1900);  //Depricated
        
    }
}
