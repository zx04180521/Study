package DailyQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”*/
public class DeleteSameChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        Set<Character> set=new HashSet<>();
        for(int i=0;i<str2.length();i++){
            set.add(str2.charAt(i));
        }
        for(int i=0;i<str1.length();i++){
            char c=str1.charAt(i);
            if(set.contains(c)){
                continue;
            }else{
                System.out.print(c);
            }
        }
    }
}
