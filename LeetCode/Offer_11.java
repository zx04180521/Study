package LeetCode;
/*
* 旋转数组的最小数字
* 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
* 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
* 例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
* */
public class Offer_11 {
    public static void main(String[] args) {
        int[] a=new int[]{2,2,2,0,1};
        System.out.println(minArray(a));
    }
    public static int minArray(int[] numbers) {
        int left=0;
        int right=numbers.length-1;
        int mid=0;
        while(left<right){
            mid=(right+left)/2;
            if(numbers[left]<numbers[right]){
                return numbers[left];
            }
            if(numbers[mid]>numbers[left]){
                left=mid+1;
            }else if(numbers[mid]<numbers[left]){
                right=mid;
            }else{
                left++;
            }
        }
        return numbers[right];


//        int l = 0, r = numbers.length - 1;
//        while (l < r) {
//            int mid = ((r - l) >> 1) + l;
//            //只要右边比中间大，那右边一定是有序数组
//            if (numbers[r] > numbers[mid]) {
//                r = mid;
//            } else if (numbers[r] < numbers[mid]) {
//                l = mid + 1;
//                //去重
//            } else r--;
//        }
//        return numbers[l];


    }
}
