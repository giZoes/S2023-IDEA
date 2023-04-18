package Test;

public class DayCount {
    public void dayCount(int year, int month, int day) {
        /********** Begin *********/
        int[] A = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] B = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = 0;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            for (int i = 0; i < month; i++) {
                count += B[i];
            }
        } else {
            for (int i = 0; i < month; i++) {
                count += A[i];
            }
        }
        System.out.println(count + day);
        /********** End *********/
    }
}