package Test;

public class TTT {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    continue;
                } else {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
