package Ch4;

public class TestStatic {
	int x = 1;
	// 静态变量或者类变量，存放在方法区
	static int i;

	// 静态初始化块，完成静态数据的初始化，只执行1次
	static {
		i = 1;
	}

	// 静态方法，没有动态绑定机制
	public static void main(String[] args) {
		System.out.println();
	}

}
