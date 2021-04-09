package LeetCode;

import java.util.Stack;

/*反转单词顺序*/
public class Offer_58 {
    public static void main(String[] args) {

    }
    public static String reverseWords(String s) {
        s=s.trim();
        Stack<String> stack=new Stack<>();
        int start=0;
        int end=0;
        int length=s.length();
        while(end<length){
            while(end<length && s.charAt(end)!=' '){
                end++;
            }
            stack.push(s.substring(start,end));
            while(end<length && s.charAt(end)==' ' ){
                end++;
            }
            start=end;
        }
        StringBuffer strBuf=new StringBuffer();
        while(!stack.isEmpty()){
            strBuf.append(stack.pop());
            strBuf.append(" ");
        }
        return strBuf.toString().trim();
    }
}
