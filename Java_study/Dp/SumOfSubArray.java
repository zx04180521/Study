package Dp;
/*连续子数组的最大和*/
public class SumOfSubArray {
    public static void main(String[] args) {

    }
    public int FindGreatestSumOfSubArray(int[] array) {
        int curSum=array[0];
        int maxSum=array[0];
        for(int i=1;i<array.length;i++){
            curSum=Math.max(curSum+array[i],array[i]);
            maxSum=Math.max(curSum,maxSum);
        }
        return maxSum;
    }
    //方法二
    public int maxSubArray(int[] nums) {
        int length=nums.length;
        int cur=nums[0];
        for(int i=1;i<length;i++){
            nums[i]+=Math.max(nums[i-1],0);
            cur=Math.max(nums[i],cur);
        }
        return cur;
    }
}
