package DateAndTime;
/********** Begin *********/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/********** End *********/

public class TestDiff {

    public static void main(String[] args) {
        /********** Begin *********/
        Scanner scanner= new Scanner(System.in);
        String str=scanner.nextLine();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate diff=LocalDate.parse(str,dateTimeFormatter);
        LocalDate now=LocalDate.now();
        if (diff.getMonth() == now.getMonth() && diff.getDayOfMonth() == now.getDayOfMonth()) {
            System.out.println("ture");
        }else {
            System.out.println("false");
        }
        Period period=Period.between(diff,now);
        System.out.println("今年是"+period.getYears()+"周年纪念日");
        /********** End *********/
    }

}