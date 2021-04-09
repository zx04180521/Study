package LeetCode;
/*括号匹配*/
import java.util.Stack;

public class Leetcode_20 {
    public static void main(String[] args) {
        String s="()";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }
            if(stack.isEmpty()){
                return false;
            }
            if(c==')'||c==']'||c=='}'){
                Character top = stack.pop();
                if((top=='('&&c!=')')||(top=='['&&c !=']')||(top=='{'&&c!='}')){
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;







//        Stack<Character> stack = new Stack<>();
//        for(int i=0;i<s.length();i++){
//            char c=s.charAt(i);
//            if(c=='('){
//                stack.push(')');
//            }else if(c=='{'){
//                stack.push('}');
//            }else if(c=='['){
//                stack.push(']');
//            }else if(stack.isEmpty()||c!=stack.pop()){
//                return false;
//            }
//        }
//        if(stack.isEmpty()){
//            return true;
//        }
//        return false;
    }
}
