package DailyQuestions;

import java.util.Scanner;

/*分解因数*/
public class FenJieYinZi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            StringBuffer s=new StringBuffer();
            s.append(n);
            s.append(" ");
            s.append("=");
            s.append(" ");
            for(int i=2;i<=Math.sqrt(n);i++){
                while(n%i==0){
                    s.append(i);
                    s.append(" ");
                    s.append("*");
                    s.append(" ");
                    n/=i;
                }
            }
            if(n!=1){
                s.append(n);
            }else{
                s.deleteCharAt(s.length()-2);
            }
            System.out.println(s);
        }
    }
}
