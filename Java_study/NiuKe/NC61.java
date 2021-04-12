package NiuKe;

import java.util.HashMap;
import java.util.Map;

/*两数之和*/
public class NC61 {
    public static void main(String[] args) {

    }
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int temp=numbers[i];
            if(map.containsKey(target-temp)){
                return new int[]{map.get(target-temp)+1,i+1};
            }
            map.put(temp,i);
        }
        return new int[]{};
    }
}
