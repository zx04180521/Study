package Vacation_zuoye;

import java.util.Arrays;

public class Practice_01 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            String str1=String.valueOf(s.charAt(left));
            String str2=String.valueOf(s.charAt(right));
            if (!str1.equalsIgnoreCase(str2))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
