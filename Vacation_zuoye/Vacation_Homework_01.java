package Vacation_zuoye;

import java.util.Arrays;

public class Vacation_Homework_01 {
    public static void main(String[] args) {

        //大写字母转化为小写字母
//        String str = "QWer";
//        System.out.println(toLowerCase(str));

        //数组右移
//        int[] arr={1,2,3,4};
//        Solution(arr,1);


        //给定一个数组 nums 和一个值 val ，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
        // 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成
//        int[] nums={1,2,3,2,3,4,3,2,5,6};
//        int m= Soulution1(nums,2);
//        System.out.println(m);


        //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它
        //      将会被按顺序插入的位置,你可以假设数组中无重复元素
//        int[] a = {1, 2, 4, 5};
//        int i = Soulution3(a, 3);
//        System.out.println(i);

    }
    //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它
      //      将会被按顺序插入的位置,你可以假设数组中无重复元素
    private static int Soulution3(int[] a, int m) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == m || a[i] > m) {
                return i;
            }
            if (m > a[a.length - 1]) {
                return a.length;
            }
        }
        return 0;
    }

    //给定一个数组 nums 和一个值 val ，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
    // 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成
    private static int Soulution1(int[] a, int val) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == val) {
            } else {
                a[j] = a[i];
                j++;
            }
        }
        return j;
    }


    //数组右移
    private static void Solution(int[] arr, int a) {
        for (int i = 0; i < a; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;

        }
        System.out.println(Arrays.toString(arr));

    }

    //大写字母转化为小写字母
    private static String toLowerCase(String str) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 'A' && a[i] <= 'Z') {
                a[i] += 32;
            }
        }
//        String newstr = "";
//        for (int j = 0; j < a.length; j++) {
//            newstr += a[j];
//        }

//        System.out.println(a);
        String ss = Arrays.toString(a);
        String ss2 = new String(a);

        return ss2;
    }
}
