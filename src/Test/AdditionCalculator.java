package Test;

public class AdditionCalculator {
    public void addition(int a, int n) {
        /********** Begin *********/
        int tmp = a, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += tmp;
            tmp = 10 * tmp + a;
        }
        System.out.println(sum);
        /********** End *********/
    }
}