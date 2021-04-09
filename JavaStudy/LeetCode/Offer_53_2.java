package LeetCode;

public class Offer_53_2 {
    public static void main(String[] args) {

    }
    public static int missingNumber(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]==mid){
                left=mid+1;
            }else{
                right=mid;
            }

        }
        return right==nums[right]?right+1:right;
    }
    //方法二
//    public int missingNumber(int[] nums) {
//        int res=0;
//        for(int i=0;i<nums.length;i++){
//            res^=(i+1)^nums[i];
//        }
//        return res;
//    }
}
