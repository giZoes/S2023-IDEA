package Test;

import java.util.Scanner;

public class ForPractice4 {
    public static void main(String[] args) {
        /*****start*****/
        Scanner sc = new Scanner(System.in);
        int res = 1000, out = 0, in = 0;
        System.out.println("欢迎使用中国人民银行ATM取款机");
        do {
            System.out.print("输入取款金额：");
            if (sc.hasNextInt()) out = sc.nextInt();
            if (out > res) {
                System.out.println("目前余额：" + res + "无法满足您的取款需求！");
            } else {
                res -= out;
                out = 0;
                System.out.print("剩余金额：" + res + "，是否继续（'1'：结束，'2'：继续）：");
                if (sc.hasNextInt()) in = sc.nextInt();
            }
        } while (in != 1);
        System.out.println("取款结束！");
        /*****end*****/
    }
}
