package LeetCode;

public class Solution_0127 {

    public static void main(String[] args) {
        String a = "10";
        String b = "01";
//给定两个二进制字符串，返回他们的和（用二进制表示）。输入为非空字符串且只包含数字 1 和 0.
        System.out.println(addBinary(a, b));
    }
    //给定两个二进制字符串，返回他们的和（用二进制表示）。输入为非空字符串且只包含数字 1 和 0.
    public static String addBinary(String a, String b) {
        int n=Math.max(a.length(),b.length());
        StringBuffer str=new StringBuffer();
        int current=0;
        for(int i=0;i<n;i++){
            current+=i<a.length()?a.charAt(a.length()-1-i)-'0':0;
            current+=i<b.length()?b.charAt(b.length()-1-i)-'0':0;
            str.append(current%2);
            current/=2;
        }
        if(current>0){
            str.append(1);
        }
        return  new String(str.reverse());

    }
}
