package Example;

class Solution {
    public static void main(String[] args) {
        int[] a = {-1, -1, -1, -1, 0, 1};
        System.out.println(pivotIndex(a));

    }

    public static int pivotIndex(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int lsum = 0;
        int rsum = 0;
        int lcount = 0;
        int rcount = 0;
        while (l < r) {
            while (l < r && Math.abs(rsum) <= Math.abs(lsum)) {
                rsum += nums[r--];
                rcount++;
            }
            while (l < r && Math.abs(lsum) <= Math.abs(rsum)) {
                lsum += nums[l++];
                lcount++;
            }

            if (lsum == rsum && (lcount + rcount == nums.length - 1)) {
                return lcount;
            }
        }
        return -1;
    }
}