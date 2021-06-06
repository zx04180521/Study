package DailyQuestions;

import java.util.Scanner;

/*整数的阶乘末尾0的个数*/
public class TailZeroNums {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=countZero(n);
        System.out.println(res);
    }
    public static int countZero(int n){
        int temp=0;
        while(n>0){
            temp+=n/5;
            n/=5;
        }
        return temp;
    }
}
