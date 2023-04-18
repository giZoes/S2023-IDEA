package Ch3;

public class TestSwitch {
	public static void main(String[] args) {
		char ch = '7';
		int r = 10;
		// Java14+, ->:自带break
		switch (ch + 1) {
		case '7'-> r = r + 8;
		case '8'-> r = r + 5;
		case '9'-> r = r + 6;
		default -> r = r + 8;
		}
		System.out.println(r);
	}
	
	// Java17+
	// 接收null类型
	static void testSwitch(String s) {
		switch (s) {
		case null -> System.out.println("Oops");
		default -> System.out.println("OK");
		}
	}
	// 使用Object类型
	static String testSwitch2(Object o) {
		return switch (o) {
		case Integer i -> String.format("int %d", i);
		case Long l -> String.format("long %d", l);
		case Double d -> String.format("double %f", d);
		case String s -> String.format("String %s", s);
		default -> o.toString();
		};
	}
}
