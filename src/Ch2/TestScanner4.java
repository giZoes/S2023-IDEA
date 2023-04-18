package Ch2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestScanner4 {

    public static void main(String[] args) {
        String input = "TV cost 877 dollar,Computer cost 2398 dollar";
        double sum = 0;
        Scanner sc = new Scanner(input);

        while (sc.hasNext()) {
            try {
                // 正常流程
                sum += sc.nextDouble();
            } catch (InputMismatchException ex) {
                // 出错流程
                sc.next();
            }
        }
        // here....殊途同归
        System.out.println(sum);

    }

}
