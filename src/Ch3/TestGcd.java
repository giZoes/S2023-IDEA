package Ch3;

public class TestGcd {

	public static void main(String[] args) {
		int a = 1997, b = 615;
		int r = a % b;
		while(r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		System.out.println(b);

	}

}
