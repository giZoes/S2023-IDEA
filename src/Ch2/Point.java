package Ch2;

public class Point {
    // 数据成员+方法
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        // Java没有运算符重载，+，如果一个操作数是字符串，字符串的拼接
        return "[" + x + ", " + y + "]";
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

}
