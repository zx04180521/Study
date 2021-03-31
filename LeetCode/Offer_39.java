package LeetCode;
/*数组中出现次数超过长度一半的数字*/
import java.util.HashMap;
import java.util.Map;

public class Offer_39 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,5,5,5,5};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int res=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>(nums.length)/2){
                res=entry.getKey();
            }
        }
        return res;
    }
}
