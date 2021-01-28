package Vacation_zuoye;

import java.util.Arrays;

public class Vacation_Homework_05 {
    public static void main(String[] args) {
        //给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));


        //    给定一组字符，使用原地算法将其压缩。压缩后的长度必须始终小于或等于原数组长度。数组的每个元素应该
        //    是长度为1 的字符（不是 int 整数类型）。在完成原地修改输入数组后，返回数组的新长度.
//        char[] a = {'a', 'a', 'e', 'e', 'c'};
//        System.out.println(compress(a));

    }

    //给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
    public static boolean isPalindrome(String s) {

        //快排思想
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            /*           while (left < right && !Character.isLetter(s.charAt(left)) && (s.charAt(left) > '9' || s.charAt(left) < '0')) {*/
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            /*while (left < right && !Character.isLetter(s.charAt(right))&&( s.charAt(right) > '9' || s.charAt(right) < '0')) {*/
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (!String.valueOf(s.charAt(left)).equalsIgnoreCase(String.valueOf(s.charAt(right))))
                return false;
            left++;
            right--;
        }
        return true;


//利用StringBuffer类
//        StringBuffer sb = new StringBuffer();
//        int length = s.length();
//        for (int i = 0; i < length; i++) {
//            char ch = s.charAt(i);
//            if (Character.isLetterOrDigit(ch)) {
//                sb.append(Character.toLowerCase(ch));
//            }
//        }
//        StringBuffer sb_rev = new StringBuffer(sb).reverse();
//        return sb.toString().equals(sb_rev.toString());

    }

    //    给定一组字符，使用原地算法将其压缩。压缩后的长度必须始终小于或等于原数组长度。数组的每个元素应该
//    是长度为1 的字符（不是 int 整数类型）。在完成原地修改输入数组后，返回数组的新长度.
    public static int compress(char[] chars) {
        int current = 0, write = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                chars[write++] = chars[current];
                if (read > current) {
                    for (char c : ("" + (read - current + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                current = read + 1;
            }
        }
        return write;
    }
}

