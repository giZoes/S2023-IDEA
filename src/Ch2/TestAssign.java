package Ch2;

public class TestAssign {

    public static void main(String[] args) {
        boolean bb1 = true;
        // 布尔型和整型不通
        char c1 = 'a';  //97
        char c2 = '好';
        // 字符型和整型相通
        char c3 = 'A';  //65

        // 数值型
        byte b1 = 127;   // -128~127
        short s1 = 633;
        int i1 = 38585;
        long l1 = 93858L;

        float f1 = 848.3774f;   // 小数默认是double类型
        double d1 = 848559.4959d;

        // 基本数据类型和包装类之间自动转换的
        Integer ii1 = 8485;   //  Integer <- int 自动装箱
        int i2 = Integer.valueOf(747585);   // int <- Integer  自动拆箱

        int i3 = new Integer(193);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        byte b2 = 74;
        Byte bb2 = Byte.valueOf(b2);

        Integer num1 = 127;
        Integer num2 = 127;
        System.out.println(num1 == num2);  // true

        Integer num3 = 128;
        Integer num4 = 128;
        System.out.println(num3 == num4);  // false

        byte b3 = (byte) 747;


    }

}
