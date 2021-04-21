package DailyQuestions;
/*反转单词顺序*/
import java.util.Scanner;
import java.util.Stack;

public class ReverseWord {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            System.out.println(reverse(str));
        }
        public static String reverse(String str){
            Stack<String> stack=new Stack<>();//创建栈
            int length=str.length();
            int start=0;
            int end=0;
            while(end<length){
                while(end<length&&str.charAt(end)!=' '){
                    //循环直到end位置是空格
                    end++;
                }
                stack.push(str.substring(start,end));//向栈中压入单词
                while(end<length&&str.charAt(end)==' '){
                    //end遍历到下一个单词的开始位置
                    end++;
                }
                start=end;//让start等于下一个单词的开始位置，进行下次遍历
            }
            StringBuffer strBuf=new StringBuffer();
            while(!stack.isEmpty()){
                strBuf.append(stack.pop()+' ');
            }
            return (new String(strBuf)).trim();
        }
}
