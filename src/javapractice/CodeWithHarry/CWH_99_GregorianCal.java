package CodeWithHarry;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CWH_99_GregorianCal {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone());
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2022));  //Check if the given year passed as an argument is Leap year or not
        System.out.println(TimeZone.getAvailableIDs()[0]);

        
    }
}
