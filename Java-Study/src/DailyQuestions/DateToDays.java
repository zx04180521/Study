package DailyQuestions;

import java.util.Scanner;

public class DateToDays {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            while(sc.hasNext()){
                int year=sc.nextInt();
                int month=sc.nextInt();
                int day=sc.nextInt();
                int Day=outDay(year,month,day);
                System.out.println(Day);
            }
        }
        public static int outDay(int year,int month,int day){
            int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
            if(year%100!=0&&year%4==0||year%400==0){
                //闰年
                days[1]=29;
            }
            int res=0;//存储天数
            //统计天数
            for(int i=0;i<month-1;i++){
                res+=days[i];
            }
            res+=day;
            return res;
        }
}
