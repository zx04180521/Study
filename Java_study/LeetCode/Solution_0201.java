package LeetCode;

public class Solution_0201 {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,5};
        System.out.println(threeConsecutiveOdds(arr));

    }
    public static boolean threeConsecutiveOdds(int[] arr) {
        int num=0;
        for (int i : arr) {
            if(num==3) break;
            num=i%2==1?num+1:0;
        }
        return num==3?true:false;
    }
}
