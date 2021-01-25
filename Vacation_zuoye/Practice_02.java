package Vacation_zuoye;

import java.util.Arrays;

public class Practice_02 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int i : nums) {
            if (third >= i || second == i || first == i) {
                continue;
            } else if (i > first) {
                third = second;
                second = first;
                first = i;
            } else if (i > second) {
                third = second;
                second = i;
            } else {
                third = i;
            }
        }
        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }


}
