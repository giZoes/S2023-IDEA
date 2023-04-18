package Ch3;

public class TestOperator {

	public static void main(String[] args) {
	    int i = 1;
	    System.out.println("i : " + i);
	    System.out.println("++i : " + ++i);
	    System.out.println("i++ : " + i++);
	    System.out.println("i: " + i);
	    
	    String str1 = new String("Hello");
	    String str2 = new String("Hello");
	    
	    System.out.println(str1 == str2);
	    System.out.println(str1.equals(str2));
	    
	    int a=1111, b=2222;
	    int temp = a;
	    a = b;
	    b = temp;
	    System.out.println("a=" + a + ", b=" + b);
	    // 异或，不需要借助第三方变量，可以交换两个变量的值
	    a = a^b;
	    b = a^b;   // b = a^b^b = a^0 = a
	    a = a^b;   // a = a^b^a = 0^b = b
	    System.out.println("a=" + a + ", b=" + b);
	    
	    // ctrl+shift+c
//	    int aa=3;
//	    aa+=aa*=aa;//aa=aa+aa*aa=3+3*3=12; C++:aa=9+3*3=18
	    
	    int aa=9,bb=11,k;
	    k= (aa!=bb)?(aa+bb):(aa-bb);
	}

}
