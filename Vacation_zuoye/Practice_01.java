package Vacation_zuoye;

import java.util.Arrays;

public class Practice_01 {
    public static void main(String[] args) {
        //给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。最高位数字存放在数组的首位， 数
        //组中每个元素只存储单个数字。(注意：你要防止的是第一个数字是9或者最后一个是9哈！这种情况会有进位滴)
        int[] a={1,1,9};
        System.out.println(Arrays.toString(plusOne(a)));
    }
    public static int[] plusOne(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                //如果不是9直接加一返回
                digits[i]++;
                return digits;
            }
            digits[i] = 0;//如果当前位是9，则需要进位，当前位赋值为0，前一位加一
        }
        //跳出for循环，说明数字全部是9
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
