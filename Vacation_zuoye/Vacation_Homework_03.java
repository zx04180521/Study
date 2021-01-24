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
//        String str = "7_28]";
//        System.out.println(reverseOnlyLetters(str));

        //给定一个非负整数数组 A ，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素(注意：不
        //是排序，只是奇数在前偶数在后哈！)
        int[] A={1,2,3,4,5,6};
        System.out.println(Arrays.toString(sortArrayByParity(A)));

//        给定一个整数类型的数组 nums ，请编写一个能够返回数组“中心索引”的方法。我们是这样定义数组中心索引
//        的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。如果数组不存在中心索引，那么我们应该
//        返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个
//        int[] nums = {-1, -1, -1, -1, -1, -1};
//        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for (int i : nums) {
            sum += i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (2 * leftSum + nums[i] == sum) {
                return i;
            } else {
                leftSum += nums[i];
            }
        }
        return -1;
    }


    //给定一个非负整数数组 A ，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素(注意：不
    //是排序，只是奇数在前偶数在后哈！)
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

    //给定一个字符串 S ，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转
    public static String reverseOnlyLetters(String S) {
        char[] arr = S.toCharArray();
        int i = 0;
        int j = S.length() - 1;
        while (i < j) {
            while (i < j && !isLetter(arr[i])) i++;
            while (i < j && !isLetter(arr[j])) j--;
            char temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
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
