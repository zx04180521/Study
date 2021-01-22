package Vacation_zuoye;

import sun.text.normalizer.UCharacter;

import java.util.Arrays;

import static java.lang.Character.isLetter;

public class Vacation_Homework_03 {
    public static void main(String[] args) {
        //给定一个按非递减顺序排序的整数数组A,返回每个数字的平方组成的新数,要求也按非递减顺序排序
//        int[] A = {-1, -2, -3, 4, 5};
//        int[] result = sortedSquares(A);
//        System.out.println(Arrays.toString(result));

        //给定一个字符串 S ，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转
        String str = "7_28]";
        System.out.println(reverseOnlyLetters(str));
    }

    //给定一个字符串 S ，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转
    public static String reverseOnlyLetters(String S) {
        char[] arr=S.toCharArray();
        int i=0;
        int j=S.length()-1;
        while(i<j){
            while(i<j&&!isLetter(arr[i]))i++;
            while(i<j&&!isLetter(arr[j])) j--;
            char temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
        }



    //给定一个按非递减顺序排序的整数数组A,返回每个数字的平方组成的新数,要求也按非递减顺序排序
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
