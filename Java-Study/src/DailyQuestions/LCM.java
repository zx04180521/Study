package DailyQuestions;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        if(A==0||B==0){
            System.out.println(0);
            return;
        }
        int min=Lcm(A,B);
        System.out.println(min);
    }
    public static int Lcm(int A,int B){
        int minAB=Math.min(A,B);
        int max=1;
        //求最大公因数
        for(int i=minAB;i>=1;i--){
            if(A%i==0&&B%i==0){
                max=i;
                break;
            }
        }
        return A*(B/max);//返回最小公倍数
    }
}
