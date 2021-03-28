package MapAndSet;
/*旧键盘
* 旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。
* 现在给出应该输入的一段文字、以及实际被输入的文字，请你列出肯定坏掉的那些键。
        输入
        7_This_is_a_test<br/>_hs_s_a_es
        输出
        7TI*/
import java.util.*;

public class BadKeyBoard{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String input=scanner.next();
            input=input.toUpperCase();
            String output=scanner.next();
            output=output.toUpperCase();
            BadKeyBoard(input,output);
            System.out.println();
        }
    }
    public static void BadKeyBoard(String input,String output){
        Set<Character> set=new HashSet<>();
        Set<Character> res=new HashSet<>();
        for(int i=0;i<output.length();i++){
            set.add(output.charAt(i));
        }
        for(int i=0;i<input.length();i++){
            Character c=input.charAt(i);
            if(set.contains(c)){
                continue;
            }
            if(res.contains(c)){
                continue;
            }
            System.out.print(c);
            res.add(c);
        }

    }
}
