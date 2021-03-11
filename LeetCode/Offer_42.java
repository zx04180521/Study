package LeetCode;
/*
*连续子数组的最大和
* 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
* */
public class Offer_42 {
    public static void main(String[] args) {
        int[] a={3,4,6,3,-2,-6,4};
        System.out.println(maxSubArray(a));
    }
    public static int maxSubArray(int[] nums) {
        int length=nums.length;
        int cur=nums[0];
        for(int i=1;i<length;i++){
            nums[i]+=Math.max(nums[i-1],0);
            cur=Math.max(nums[i],cur);
        }
        return cur;
    }
}
