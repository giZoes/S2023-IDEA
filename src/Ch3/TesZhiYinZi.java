package Ch3;

import java.util.Scanner;

public class TesZhiYinZi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();  // 18
		// num为正整数，n为质因子
		for(int n=2;n<=num;n++) {// 2~18,3
			if(n == num) {
				// 说明分解已经结束
				System.out.println(n);
				break;
			} else {
				while(num%n == 0) {//18/2=9,9/3,3/3=1, n=4,num=1, 18=2*3*3
					// 当前的质因子有重复
					num = num/n;
					System.out.print(n + ", ");
				}
			}
		}

	}

}
