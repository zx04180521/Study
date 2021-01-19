package LeetCode;

public class Practice_01 {
    public static void main(String[] args) {
        //在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
        // 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
        int[] nums = {1, 2, 3, 4, 2};
         System.out.println(findRepeatNumber(nums));
    }
    public static int findRepeatNumber(int[] nums) {
        int[] arr = new int[nums.length];
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
            if (arr[nums[i]] > 1) {
                return nums[i];
            }
        }
        return nums[i];
    }
}
