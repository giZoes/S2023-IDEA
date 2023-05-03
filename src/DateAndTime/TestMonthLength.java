package DateAndTime;
/********** Begin *********/

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/********** End *********/

public class TestMonthLength {

    public static void main(String[] args) {
        /********** Begin *********/
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        for (int i=0;i<12;i++){
            LocalDate date=LocalDate.of(year,1+i,1);
            Period period=Period.between(date,date.plusMonths(1).plusDays(-1));
            System.out.println(period.getDays()+1);
        }
        sc.close();
        /********** End *********/
    }

}