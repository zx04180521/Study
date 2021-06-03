package DailyQuestions;

import java.util.HashMap;
import java.util.Map;

public class Gifts {
    public int getValue(int[] gifts, int n) {
// write code here
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:gifts){
            //遍历gifts，将元素大小，出现次数，最为key，value插入map
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>n/2){
                //次数超过一半
                return entry.getKey();
            }
        }
        return 0;
    }
}
