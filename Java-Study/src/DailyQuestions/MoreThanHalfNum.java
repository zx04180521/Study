package DailyQuestions;

import java.util.HashMap;
import java.util.Map;

public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        int length=array.length;
        if(length==0){
            return 0;
        }

        if(length==1){
            return array[0];
        }
        int[] res=new int[length];
        for(int i=0;i<length;i++){
            res[array[i]]++;
        }
        for(int i=0;i<length;i++){
            if(res[i]>length/2){
                return i;
            }
        }
        return 0;
    }



    public int MoreThanHalfNum_Solution_1(int[] array) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:array){
            //插入map中
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>array.length/2){
                //返回value大于数组长度一半的key
                return entry.getKey();
            }
        }
        return 0;
    }
}
