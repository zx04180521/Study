package LeetCode;

import java.util.Arrays;

/*
* 调整数组顺序，使得奇数位于偶数前面
* 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
* 使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分
* */
public class Offer_21 {
    public static void main(String[] args) {
        int[] a={2,4,3,5,3,4};
        System.out.println(Arrays.toString(exchange(a)));
    }
    public static int[] exchange(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            while(left<right&&nums[left]%2!=0){left++;}
            while(left<right&&nums[right]%2==0){right--;}
            int tmp=nums[left];
            nums[left]=nums[right];
            nums[right]=tmp;
            left++;
            right--;
        }
        return nums;
    }
}
