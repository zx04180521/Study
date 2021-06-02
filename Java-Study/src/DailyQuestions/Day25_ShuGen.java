package DailyQuestions;

import java.util.Scanner;
/*数根*/
public class Day25_ShuGen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int sum=0;
            String num=sc.next();
            for(int i=0;i<num.length();i++){
                sum+=num.charAt(num.length()-i-1)-'0';
            }
            while(sum>9){
                int temp=0;
                while(sum>0){
                    temp+=sum%10;
                    sum/=10;
                }
                sum=temp;
            }
            System.out.println(sum);
        }
    }
}
