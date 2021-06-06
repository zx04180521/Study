package DailyQuestions;

import java.util.Scanner;

public class Wildcard2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.next();
            String str2=sc.next();
            System.out.println(match(str1,str2,0,0));
        }
    }
    public static boolean match(String str1, String str2, int a, int b){
        if(a==str1.length()&&b==str2.length()){

            return true;
        }
        if(a==str1.length()||b==str2.length()){
            //退出条件2
            return false;
        }
        if(str1.charAt(a)=='*'){
            //带通配符字符串递归的位置是*
            return match(str1,str2,a+1,b)|| match(str1,str2,a+1,b+1)|| match(str1,str2,a,b+1);
        }else if(str1.charAt(a)=='?'){
            //带通配符字符串递归的位置是?
            return match(str1,str2,a+1,b+1);
        }else if(str1.charAt(a)==str2.charAt(b)){
            //两个字符串递归的位置字符相等
            return match(str1,str2,a+1,b+1);
        }else{
            //两个字符串递归的位置字符不相等
            return false;
        }
    }
}
