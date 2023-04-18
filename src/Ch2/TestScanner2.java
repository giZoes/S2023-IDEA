package Ch2;

import java.util.Scanner;

public class TestScanner2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nextXXXX()
        float f1 = sc.nextFloat();
        double d1 = sc.nextDouble();
        String str1 = sc.next();  // 空白符（空格，回车，Tab...）
        String str2 = sc.nextLine();  // 回车符（\n）

        // 读取批量数据
        while (sc.hasNextInt()) {
            sc.nextInt();
        }
    }

}
