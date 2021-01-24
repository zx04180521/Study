package Vacation_zuoye;

import java.util.Arrays;

public class Practice_02 {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5,6};
        System.out.println(Arrays.toString(sortArrayByParity(A)));
    }
    public static int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            while ((left < right) && (A[right] % 2 != 0)) {
                right--;
            }
            while ((left < right) && (A[left] % 2 == 0)) {
                left++;
            }
            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;
            right--;
            left++;
        }
        return A;
    }



}
