package LeetCode;
/*二分查找*/
public class LeetCode_704 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,7,8,9};
        System.out.println(search(arr,5));
    }
    public static int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>target){
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }else{
                return mid;
            }
        }
        if(nums[left]!=target)
        {
            return -1;
        }
        return left;
    }
}
