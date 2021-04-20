package DailyQuestions;

import java.util.Scanner;

public class HexBinDecOct {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=sc.nextInt();
        char[] temp={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        boolean b=false;//表示正数
        if(num<0){
            b=true;//表示负数
            num=0-num;
        }
        StringBuffer strBuf=new StringBuffer();
        while(num>0){
            //num%n得到转化后的每一位数字，
            // 十六进制大于10需要得到A,B,C,D,E,F所以需要用到上面定义的数组
            strBuf.append(temp[num%n]);
            num/=n;
        }
        if(b){
            //如果原数字是负数
            strBuf.append('-');
        }
        System.out.println(strBuf.reverse());//反转并输出
    }
}
