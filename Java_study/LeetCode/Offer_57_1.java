package LeetCode;
/*和为s的两个数字 */
public class Offer_57_1 {
    public static void main(String[] args) {

    }
    public static int[] twoSum(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int res=nums[left]+nums[right];
            if(res==target){
                return new int[]{nums[left],nums[right]};
            }else if(res>target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{};
    }
}
