package seven;

import java.util.*; 
public class Example7_3{
    public static void main(String args[ ]){
        Calendar 日历=Calendar.getInstance();
        日历.set(1931,8,1);     //8代表九月 
        int 星期几=日历.get(Calendar.DAY_OF_WEEK)-1;
        String a[]=new String[星期几+30];  //存放号码的一维数组
        for(int i=0;i<星期几;i++){
           a[i]="";
        }
        for(int i=星期几,n=1;i<星期几+30;i++){
           a[i]=String.valueOf(n) ;
           n++;
        }
        int year=日历.get(Calendar.YEAR),
        month=日历.get(Calendar.MONTH)+1;
        System.out.println(" "+year+"年"+month+"月"+"18日,日本发动侵华战争");
        System.out.printf("%4c%4c%4c%4c%4c%4c%4c\n",'日','一','二', '三','四','五','六');    
        for(int i=0;i<a.length;i++){
           if(i%7==0&&i!=0)
              System.out.printf("\n");
           System.out.printf("%5s",a[i]);      
        } 
    } 
}