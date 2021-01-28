package Vacation_zuoye;

import static java.lang.Character.isLetter;

public class Practice_03 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer sb_rev = new StringBuffer(sb).reverse();
        return sb.toString().equals(sb_rev.toString());

    }

}
