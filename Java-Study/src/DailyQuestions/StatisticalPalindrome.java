package DailyQuestions;

import java.util.Scanner;

public class StatisticalPalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        int count=0;
        for(int i=0;i<=A.length();i++){
            StringBuffer strBuf=new StringBuffer(A);
            //将字符串B插入A的第i个位置
            strBuf.insert(i,B);
            String str1=new String(strBuf);
            strBuf.reverse();
            //判断是否是回文
            if(str1.equals(strBuf.toString())){
                count++;
            }
        }
        System.out.println(count);
    }
}
