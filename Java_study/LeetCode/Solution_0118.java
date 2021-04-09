package LeetCode;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Solution_0118 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 2};
        int[] nums2={2,5,5,7};

        //输入一个整数（以二进制串形式），输出该数二进制表示中 1 的个数。
//        int a=5;
//        System.out.println(hammingWeight(a));


        //在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
        // 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
      // System.out.println(findRepeatNumber(nums));


        //给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//你可以按任意顺序返回答案。
      // System.out.println(Arrays.toString(twoSum(nums2,10)));



    }

    //在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
    // 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
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


    //给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//你可以按任意顺序返回答案。
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

//输入一个整数（以二进制串形式），输出该数二进制表示中 1 的个数。
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

}
