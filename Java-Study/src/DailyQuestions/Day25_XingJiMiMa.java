package DailyQuestions;

import java.util.Scanner;

public class Day25_XingJiMiMa {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] ary=new int[10000];
            ary[0]=1;
            ary[1]=2;
            for(int i=2;i<10000;i++){
                ary[i]=(ary[i-1]+ary[i-2])%10000;
            }
            for(int i=0;i<n;i++){
                System.out.printf("%04d",ary[sc.nextInt()-1]);//格式化输出
            }
            System.out.println();
        }
    }

}
