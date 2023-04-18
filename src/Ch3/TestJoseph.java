package Ch3;

import java.util.Scanner;

public class TestJoseph {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  // n个人
		int[] a = new int[n];   // int默认值是0
		
		int i = 0, t = 0; // i记录报数的位置变化，t报数器
		while(n>1) {
			if(a[i] == 0) {
				t++;
				if (t == 3) {
					t = 0;
					a[i] = 1;// i位置出圈
					n--;
				}
			}
			i++;  // i位置已处理玩或者出圈的人，两者都要越过去i这个位置
			if(i == a.length) {
				i = 0;  // 报到最后一个人，重头开始做
			}
		}
		// 输出结果
		for(int j=0;j<a.length;j++) {
			if (a[j] != 1) {
				System.out.println(j + 1);
			}
		}
		
	}

}
