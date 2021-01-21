package Vacation_zuoye;

import java.util.Arrays;

public class Vacation_Homework_02 {
    public static void main(String[] args) {
        //判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
//        System.out.println(isPalindrome(122));

        //给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
//        int[] nums1 = {1, 3, 5, 0, 0, 0};
//        int[] nums2 = {0, 2, 4};
//        merge(nums1, 3, nums2, 3);


        //给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。如果不存在最后一个单词请返回 0
//        String str = "Hello world";
//        System.out.println(lengthOfLastWord(str));

        //给定一个整数数组，判断是否存在重复元素。如果任何值在数组中出现至少两次，函数返回 true。如果数组中
        //每个元素都不相同，则返回 false。
        int[] nums = {1, 2, 3, 4, 5, 5};
        System.out.println(containsDuplicate(nums));


        //你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入1 次或多次。你将会检查
        // 键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True
//        System.out.println(isLongPressedName("zhang", "zzhhaanngg"));

    }

    //你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入1 次或多次。你将会检查
    // 键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True

    public static boolean isLongPressedName(String name, String typed) {
        if (name.equals(typed)) {
            //字符串相等
            return true;
        }
        if (typed.length() < name.length()) {
            //长度小于name
            return false;
        }
        if(typed.charAt(0)!=name.charAt(0)){
            //首元素不同
            return false;
        }
        if (typed.charAt((typed.length() - 1)) != name.charAt((name.length() - 1))) {
            //尾元素不同
            return false;
        }
        int num=0;
        int count=0;
        for(int i=0;i<typed.length();i++){
            if(name.charAt(num)==typed.charAt(i)){
                if(num==(name.length()-1)){
                    //如果num自增到尾元素下标不再自增，否则上一条if语句数组下标越界
                    num=num;
                    count++;
                }else{
                    num++;
                }
            }else if(typed.charAt(i)==typed.charAt(i-1)){
                count++;
            }else{
                return false;
            }

        }
        if((typed.length()-count+1)!=name.length())return false;
        return true;
    }

    //给定一个整数数组，判断是否存在重复元素。如果任何值在数组中出现至少两次，函数返回 true。如果数组中
    //每个元素都不相同，则返回 false。
    public static boolean containsDuplicate(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        int[] a = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            a[nums[i]]++;
            if (a[nums[i]] > 1) {
                return true;
            }
        }
        return false;
    }


    //判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
    public static boolean isPalindrome(int x) {
        String str = x + "";
        StringBuffer sb = new StringBuffer();
        sb.append(x);
        sb.reverse();
        String str1 = new String(sb);
        if (str1.equals(str)) {
            return true;
        }
        return false;
    }

    //给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (nums1[m] >= nums2[n]) {
                nums1[length--] = nums1[m--];
            } else {
                nums1[length--] = nums2[n--];
            }
        }
        while (n >= 0) {
            nums1[length--] = nums2[n--];
        }
        System.out.println(Arrays.toString(nums1));
    }

    private static String lengthOfLastWord(String str) {
        int length = str.length();
        String[] arr = str.split(" ");
        if (str.isEmpty()) {
            return new String(String.valueOf(0));
        } else {
            return new String(arr[arr.length - 1]);
        }
    }

}
