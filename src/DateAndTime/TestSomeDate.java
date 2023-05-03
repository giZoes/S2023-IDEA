package DateAndTime;
/********** Begin *********/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/********** End *********/

public class TestSomeDate {

    public static void main(String[] args) throws ParseException {
        /********** Begin *********/
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Calendar calendar=Calendar.getInstance();
        GregorianCalendar gregorianCalendar=new GregorianCalendar();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        calendar.setTime(simpleDateFormat.parse(str));
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int day=calendar.get(Calendar.DAY_OF_WEEK)-1;
        if (gregorianCalendar.isLeapYear(year)){
            System.out.println(year+"年是闰年");
        }else {
            System.out.println(year+"年不是闰年");
        }
        System.out.println("这一个月有"+month+"天");
        System.out.println("这一天是周"+day);
        /********** End *********/
    }

}