package Ch3;

public class TestZhongHua {
	static String[][] zhonghua = {
			{"从", "我", "做", "起", "振"},
			{"我", "做", "起", "振", "兴"},
			{"做", "起", "振", "兴", "中"},
			{"起", "振", "兴", "中", "华"}
	};
	static int num = 0;
	public static void main(String[] args) {
		walk(0, 0);
		System.out.println(num);
	}
	
	public static void walk(int x, int y) {
		if (x == 4 || y == 5)
			return;
		if (x == 3 && y == 4) {  // 华
			num++;
		}
		walk(x+1, y);
		walk(x, y+1);
		
	}

}
