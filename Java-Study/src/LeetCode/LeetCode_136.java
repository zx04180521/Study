package LeetCode;
/*只出现一次的数字*/
import java.util.HashMap;
import java.util.Map;

public class LeetCode_136 {
    public static void main(String[] args) {
int[] arr={1,1,2,2,4,4,3};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value=map.getOrDefault(nums[i],0);
            map.put(nums[i],value+1);
        }
        int res=-1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue().equals(1)){
                res=entry.getKey();
            }
        }
        return res;
    }
    //方法二：
    public int singleNumber_2(int[] nums) {
        int i=0;
        for(int a:nums){
            i=i^a;
        }
        return i;
    }
}
