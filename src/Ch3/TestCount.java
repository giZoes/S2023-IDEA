package Ch3;

import java.util.Scanner;

public class TestCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		// for
		int count = 0;
		for(int i=1; number/i != 0; i*=10) {
			count++;
		}
		// while
		int i=1; count=0;
		while(number/i != 0) {
			count++;
			i*=10;
		}
		System.out.println(count);
	}

}
