package LeetCode;

import java.util.Arrays;

public class Practice_03 {
    public static void main(String[] args) {
        int[] nums={2,5,5,6};
        System.out.println(Arrays.toString(twoSum(nums,10)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int i = 0, j = 0;
        int[] a = new int[2];
        //str=new String();
        for (i = 0; i < nums.length - 1; i++) {
            for (j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return a;
    }
}
