package Ch3;

public class Loop {
    public static void main(String[] args) {
        System.out.println(sol(9, 3));
        System.out.println(sol(7, 3));
        System.out.println(sol(11, 3));
        System.out.println(sol(22, 3));
    }

    public static int sol(int a, int b) {
        int p = 0;
        for (int i = 2; i <= a; i++) {
            p = (p + b) % i;
        }
        return p + 1;
    }
}
