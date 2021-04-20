package DailyQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*字符串中找出连续最长的数字串*/
public class MaxLengthDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String res=longDigit(str);
        System.out.println(res);
    }
    public static String longDigit(String str){
        int max=0;//记录当前最长连续数字串
        int start=0;//数字串开始位置
        int end=0;//数字串结束位置
        int length=str.length();
        int index=0;
        while(end<length){
            while(end<length&&!Character.isDigit(str.charAt(end))){
                //end移动到当前数字串的第一个位置
                end++;
            }
            start=end;//记录当前数字串开始位置
            while(end<length&&!Character.isLetter(str.charAt(end))){
                //end移动到数字串结束的第一个位置
                end++;
            }
            if(end-start>max){
                //动态记录最长数字串
                max=end-start;//记录最长数字串长度
                index=start;//记录最长数字串开始的下标
            }
        }
        return str.substring(index,index+max);
    }



}
