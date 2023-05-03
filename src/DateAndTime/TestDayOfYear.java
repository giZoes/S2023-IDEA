package DateAndTime;
/********** Begin *********/
import java.util.Calendar;
import java.util.Scanner;
/********** End *********/

public class TestDayOfYear {

    public static void main(String[] args) {
        /********** Begin *********/
        Calendar calendar=Calendar.getInstance();
        Scanner sc=new Scanner(System.in);
        calendar.set(sc.nextInt(),sc.nextInt()-1,sc.nextInt());
        System.out.printf("%tj",calendar);
        sc.close();
        /********** End *********/
    }

}