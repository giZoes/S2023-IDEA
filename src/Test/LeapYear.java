package Test;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year = 0;
        /********** Begin *********/
        Scanner sc = new Scanner(System.in);
        // while(sc.hasNextInt())
        {
            year = sc.nextInt();
        }

        //在此补全小括号内的逻辑运算式，以判断输入的年份是否为闰年
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {   //判定输入的年份为闰年，执行下面大括号中的语句
            System.out.print("Yes");

        } else {   //判定输入的年份不是闰年，执行下面大括号中的语句
            System.out.print("No");

        }
        /********** End *********/
    }
}