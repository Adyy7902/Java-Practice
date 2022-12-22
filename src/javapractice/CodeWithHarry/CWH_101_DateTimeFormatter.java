package CodeWithHarry;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class CWH_101_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy --E HH:mm:ss a"); //E is used to see the day-of-the-week
        //a is used to see AM and PM //H is used to print Hour, mm is used to print minute in two digits ss is used to print second in two digit
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE.ofPattern("dd+MM+yyyy"); //format can be selected by seeing the java documentation

        String myDate1 = dt.format(df1);
        System.out.println(myDate1);
        
        String myDate2 = dt.format(df2);
        System.out.println(myDate2);
    }
}
