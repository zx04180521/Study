package DailyQuestions;

import java.util.Scanner;
/*查找组成一个偶数最接近的两个素数*/
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            //查找差值最小的两个数，则直接从num/2开始查找
            for(int i=num/2;i>1;i++){
                if(isPrime(i)&&isPrime(num-i)){
                    System.out.println(num-i);
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    //判断素数
    public static boolean isPrime(int m){
        for(int i=2;i*i<=m;i++){
            if(m%i==0){
                return false;
            }
        }
        return true;
    }
}
