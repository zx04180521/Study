package Vacation_zuoye;

import java.util.Arrays;

public class Vacation_Homework_04 {
    public static void main(String[] args) {
        //给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。最高位数字存放在数组的首位， 数
        //组中每个元素只存储单个数字。(注意：你要防止的是第一个数字是9或者最后一个是9哈！这种情况会有进位滴)
//        int[] a={1,1,9};
//        System.out.println(Arrays.toString(plusOne(a)));

//        给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
//        int[] nums = {1};
//        System.out.println(thirdMax(nums));

    }
    //   给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
    public static int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int i : nums) {
            if (third >= i || second == i || first == i) {
                continue;
            } else if (i > first) {
                third = second;
                second = first;
                first = i;
            } else if (i > second) {
                third = second;
                second = i;
            } else {
                third = i;
            }
        }
        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }


    public static int[] plusOne(int[] digits) {
//        StringBuilder s= new StringBuilder();
//        for(int i:digits){
//            s.append(i);
//        }
//        long num=Long.parseLong(s.toString());
//        num++;
//        String str=num+"";
//        int[] q=new int[str.length()];
//        for(int i=0;i<str.length();i++){
//            String str2=new String(String.valueOf(str.charAt(i)));
//            q[i]=Integer.parseInt(str2);
//        }
//        return q;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        //跳出for循环，说明数字全部是9

        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;

    }
}
