package Vacation_zuoye;

import java.util.Arrays;

public class Practice_01 {
    public static void main(String[] args) {
        int[] nums={1,2,3,5,6,4,7};
        System.out.println(findUnsortedSubarray(nums));
    }
    public static int  findUnsortedSubarray(int[] nums){
        int left=0;
        int right=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            else if(nums[i]<max) {
                right=i;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<min){
                min=nums[i];
            }else if(nums[i]>min){
                left=i;
            }
        }
        if(left==right){
            return 0;
        }
        return right-left+1;
    }


}
