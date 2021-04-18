package Example;

import java.util.Stack;

public class Example_03 {
    public static void main(String[] args) {
        String str="the sky is blue";
        System.out.println(reverseWords(str));

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
        return strBuf.toString();
    }
}


