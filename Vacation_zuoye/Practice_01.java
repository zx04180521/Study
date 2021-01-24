package Vacation_zuoye;

public class Practice_01 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,2,1};
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for (int i : nums) {
            sum += i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (2 * leftSum + nums[i] == sum) {
                return i;
            } else {
                leftSum += nums[i];
            }
        }
        return -1;
    }
}
