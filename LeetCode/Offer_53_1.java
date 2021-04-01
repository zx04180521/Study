package LeetCode;
/*在排序数组中查找某个数字出现次数*/

public class Offer_53_1 {
    public static void main(String[] args) {
        int[] arr={4,5,7,7,8,8,9};
        System.out.println(search(arr,8));
    }
    public static int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        int count=0;
        while(left<nums.length&&nums[left++]==target)
            count++;
        return count;
    }
}
