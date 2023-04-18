package Ch3;

public class TestBear {
	public static int discard = 0;

	public static void main(String[] args) {
		eat(1543);
		System.out.println(discard);
	}
	
	public static void eat(int x) {
		if(x == 0)
			return;
		if(x == 1) {
			discard++;
			return;
		}
		
		if (x % 2 == 0) {
			eat(x/2);
		} else {
			discard++;
			x = x - 1;
			eat(x/2);
		}
		
	}

}
