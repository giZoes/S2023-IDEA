package Ch3;

import java.util.Scanner;

public class TestDesc {
	// 三位数，判断是不是降序数：百位>十位>个位
	public static void main(String[] args) {
		int bai, shi, ge;
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		bai = number / 100;
		shi = (number % 100) / 10;
		ge = number % 10;
		
		if (bai > shi && shi > ge) {
			System.out.println("是降序数");
		} else {
			System.out.println("不是降序数");
		}

	}

}
