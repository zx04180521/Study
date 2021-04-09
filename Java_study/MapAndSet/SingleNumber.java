package MapAndSet;
/*LeetCode136
只出现一次的数字*/
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums){
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


//        int i=0;
//        for(int a:nums){
//            i=i^a;
//        }
//        return i;
    }
}
