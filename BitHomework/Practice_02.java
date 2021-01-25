package BitHomework;

import java.util.Arrays;

public class Practice_02 {
    public static void main(String[] args) {
        //给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
        int[] nums1={1,3,5,0,0,0};
        int[] nums2={0,2,4};
        merge(nums1,3,nums2,3);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int length=m+n-1;
        m--;n--;
        while(m>=0&&n>=0){
            if(nums1[m]>=nums2[n]){
                nums1[length--]=nums1[m--];
            }else{
                nums1[length--]=nums2[n--];
            }
        }
        while(n>= 0) {
            nums1[length--] = nums2[n--];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
