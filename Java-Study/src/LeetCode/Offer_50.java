package LeetCode;
/*
* 第一次只出现一次的字符
* 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
* */
public class Offer_50 {
    public static void main(String[] args) {
        String s="wewefdsasa";
        System.out.println(firstUniqChar(s));
    }
    public static char firstUniqChar(String s) {
        int[] ary=new int[26];
        for(int i=0;i<s.length();i++){

            int cur=s.charAt(i)-'a';
            ary[cur]++;
        }
        for(int i=0;i<s.length();i++){
            if(ary[s.charAt(i)-'a']==1)
                return s.charAt(i);
        }
        return ' ';
    }
}
