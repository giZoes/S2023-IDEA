package Ch2;
// ctrl+shift+o

import java.util.Scanner;

public class TestScanner3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        while (sc.hasNextDouble()) {
            sum += sc.nextDouble();
            count++;
        }

        System.out.println("sum=" + sum + ", average=" + sum / count);

        System.out.printf("sum=%.2f, average=%.2f", sum, sum / count);

    }

}
