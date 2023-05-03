package StudentDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Step3 {
    //获取单词的数量
    public Map<String, Integer> getWordCount(String str) {
        Map<String, Integer> map = new HashMap<String, Integer>();

//请在此添加实现代码
/********** Begin **********/
        StringTokenizer stk=new StringTokenizer(str);
        int count;
        String word;
        while (stk.hasMoreTokens()) {
            word=stk.nextToken("[ ,.’!?;:]");
            if (map.containsKey(word)){
                count=map.get(word);
                map.put(word,count);
            }else {
                map.put(word,1);
            }
        }

/********** End **********/







        return map;
    }
}
