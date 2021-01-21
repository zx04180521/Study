package Vacation_zuoye;

public class Practice_02 {
    public static void main(String[] args) {
        //给定一个整数数组，判断是否存在重复元素。如果任何值在数组中出现至少两次，函数返回 true。如果数组中
        //每个元素都不相同，则返回 false。
        int[] nums = {1, 2, 3, 4, 5, 5};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        int[] a = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            a[nums[i]]++;
            if (a[nums[i]] > 1) {
                return true;
            }
        }
        return false;
    }


}
