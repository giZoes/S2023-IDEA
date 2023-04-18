package Ch2;

public class TestArray3 {

    public static void main(String[] args) {
        int[] arr = new int[100];
        int[] count = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int digit = (int) (Math.random() * 10);
            arr[i] = digit;
            count[digit]++;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        for (int aa : count) {
            System.out.println(aa);
        }
    }

}
