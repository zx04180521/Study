package NiuKe;

import java.util.Stack;

/*括号序列*/
public class NC52 {
    public static void main(String[] args) {

    }
    public boolean isValid (String s) {
        // write code here
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                stack.push(')');
            }else if(c=='['){
                stack.push(']');
            }else if(c=='{'){
                stack.push('}');
            }
            else if(stack.isEmpty()){
                return false;
            }
            else if(c!=stack.pop()){
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
