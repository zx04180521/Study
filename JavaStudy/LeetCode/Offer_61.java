package LeetCode;
/*扑克牌中的顺子*/
import java.util.HashSet;
import java.util.Set;

public class Offer_61 {
    public static void main(String[] args) {

    }
    public boolean isStraight(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int min=14;
        int max=0;
        for(int a:nums){
            if(a==0){
                continue;
            }
            if(set.contains(a)){
                return false;
            }
            max=Math.max(a,max);
            min=Math.min(a,min);
            set.add(a);
        }
        return max-min<5;

    }

}
