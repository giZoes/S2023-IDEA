package StudentDemo;

import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Step1{

    //使用String.split()方法分割
    public List<String> splitPartition(String str){
        List<String> list=new ArrayList<String>();

//请在此添加实现代码
/********** Begin **********/
        for (String s :
                str.split("\\|")) {
            list.add(s);
        }

/********** End **********/


        return list;
    }

    //使用StringTokenizer类进行分割
    public List<String> tokenPartition(String str){
        List<String> list=new ArrayList<String>();
        //请在此添加实现代码
/********** Begin **********/
        StringTokenizer stk=new StringTokenizer(str," ");
        while (stk.hasMoreTokens()){
            list.add(stk.nextToken());
        }
/********** End **********/


        return list;
    }

}