package DateAndTime;
/********** Begin *********/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/********** End *********/

public class TestFriday {

    public static void main(String[] args) {
        /********** Begin *********/
        Scanner sc=new Scanner(System.in);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-M-dd");
        int y=sc.nextInt();
        Calendar calendar=Calendar.getInstance();
        for (int i = 0; i < 12; i++) {
            calendar.set(y,i,13);
            if (calendar.get(Calendar.DAY_OF_WEEK)==Calendar.FRIDAY){
                System.out.println(simpleDateFormat.format(calendar.getTime()));
            }
        }
        sc.close();
        /********** End *********/
    }

}