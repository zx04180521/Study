package LeetCode;

import java.util.HashMap;
import java.util.Map;

/*两数之和*/
public class LeetCode_1 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            if(map.containsKey(target-temp)){
                return new int[]{map.get(target-temp),i};
            }
            map.put(temp,i);
        }
        return new int[]{-1,-1};
    }
}
