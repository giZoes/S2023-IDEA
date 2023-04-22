package String_Class;

public class Reverse {
    public static StringBuffer start(String data) {
        StringBuffer ans = new StringBuffer();
        /********** Begin *********/
        String[] rdata=data.split(" ");
        for (int i = 1; i <=rdata.length; i++) {
            ans.append(" ");
            ans.append(rdata[rdata.length-i]);
        }
        ans.reverse();
        /********** End *********/
        return ans;
    }
}
