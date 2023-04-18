package Ch2;
// ctrl+shift+o
// .在Java被解析为目录

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();  // 读取一个分数

        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 75 && score <= 89) {
            System.out.println("良好");
        } else if (score >= 60 && score <= 74) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }

        sc.close();

    }

}
