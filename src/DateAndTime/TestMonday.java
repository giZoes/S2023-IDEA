package DateAndTime;
/********** Begin *********/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/********** End *********/

public class TestMonday {

    public static void main(String[] args) {
        /********** Begin *********/
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (int i = 0; i < 30; i++) {
            LocalDate april=LocalDate.of(2022,4,1+i);
            if (april.getDayOfWeek().getValue()==1) {
                System.out.println(april.format(dateTimeFormatter));
            }
        }
        /********** End *********/
    }

}