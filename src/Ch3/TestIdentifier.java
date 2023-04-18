package Ch3;

import java.util.Scanner;

public class TestIdentifier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			// 结尾
			if (!str.endsWith(".java")) {
				System.out.println("false");
				continue;
			}
			// 首字母
			char first = str.charAt(0);
			if (!Character.isJavaIdentifierStart(first)) {
				System.out.println("false");
				continue;
			}
			
			// 中间
			int i=1;
			for(;i<str.length()-5;i++) {
				if(!Character.isJavaIdentifierPart(str.charAt(i))) {
					System.out.println("false");
					break;
				}
			}
			
			// 合法
			if (i == (str.length()-5)) {
				System.out.println("true");
			}
		}
		sc.close();
	}

}
