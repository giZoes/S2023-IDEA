package Ch2;

enum Season {
    Spring, Summer, Autumn, Winter
}

public class TestEnum {

    public static void main(String[] args) {
        Season s = Season.Autumn;
        Season[] ss = Season.values();
        for (Season aa : ss) {
            System.out.println(aa);
        }
    }

}
