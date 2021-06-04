package DailyQuestions;

import java.util.Scanner;

public class MaxBit1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int a=sc.nextInt();
            int count=0;
            int maxCount=0;
            while(a!=0){
                if((a&1)==1){
                    count++;
                    maxCount=Math.max(count,maxCount);
                }else{
                    count=0;
                }
                a>>=1;
            }
            System.out.println(maxCount);
        }
    }












//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()){
//            int a=sc.nextInt();
//            nums(a);
//        }
//    }
//    public static void nums(int a){
//        if(a==0){
//            System.out.println(0);
//            return ;
//        }
//        StringBuffer strBuf=new StringBuffer();
//        while(a>0){
//            strBuf.append(a%2);
//            a/=2;
//        }
//        strBuf.reverse();
//        char[] chars=(strBuf.toString()).toCharArray();
//        int start=0;
//        int end=0;
//        int max=0;
//        int length=chars.length;
//        while(end<length){
//            while(end<length&&chars[end]!='1'){
//                end++;
//            }
//            start=end;
//            while(end<length&&chars[end]=='1'){
//                end++;
//            }
//            int num=end-start;
//            if(num>max){
//                max=num;
//            }
//        }
//        System.out.println(max);
//    }
}
