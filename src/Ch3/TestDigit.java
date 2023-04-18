package Ch3;

import java.util.Scanner;

public class TestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		long sum = 0, temp = a;
		int n = 12;
		
		for(int i=1;i<=n;i++) {
			sum = sum + temp;
			temp = temp*10 + a;
		}
		System.out.println(sum);
		
		sc.close();
	}

}
