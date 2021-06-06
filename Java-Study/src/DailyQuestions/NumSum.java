package DailyQuestions;

import java.util.Scanner;

/*请设计一个算法能够完成两个用字符串存储的整数进行相加操作，对非法的输入则返回error*/
public class NumSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            String[] ary=str.split(" ");
            if(!isDigit(ary[0])||!isDigit(ary[1])){
                //判断是否合法
                System.out.println("error");
                return;
            }
            String str1=ary[0];
            String str2=ary[1];
            int length1=str1.length();
            int length2=str2.length();
            int maxL=length1>length1?length1:length2;//记录较长的字符串长度，作为循环的边界
            int m=0;//记录当前位的和
            char[] c1=str1.toCharArray();
            char[] c2=str2.toCharArray();
            StringBuffer s=new StringBuffer();
            for(int i=0;i<maxL;i++){
                int temp1=i<length1?c1[length1-i-1]-'0':0;
                //如果i小于字符串长度，则值就是一个实际值，否则是0
                int temp2=i<length2?c2[length2-i-1]-'0':0;
                m+=temp2+temp1;//两个当前位的和加上上一位的进位
                s.append(m%10);//m%10表示进位后剩下的值，存储到s中
                m/=10;//m/10表示需要的进位,进行下一次循环
            }
            if(m!=0){
                //循环结束m！=0，表示最高为加完之后还需要进位
                s.append(1);
            }
            s.reverse();//逆置
            System.out.println(s);
        }
    }
    //判断字符串合法的方法
    public static boolean isDigit(String str){
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                //表示某一位不是数字
                return false;
            }
        }
        return true;
    }
}
