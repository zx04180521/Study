package seven;

import java.util.*; 
public class Example7_3{
    public static void main(String args[ ]){
        Calendar ����=Calendar.getInstance();
        ����.set(1931,8,1);     //8������� 
        int ���ڼ�=����.get(Calendar.DAY_OF_WEEK)-1;
        String a[]=new String[���ڼ�+30];  //��ź����һά����
        for(int i=0;i<���ڼ�;i++){
           a[i]="";
        }
        for(int i=���ڼ�,n=1;i<���ڼ�+30;i++){
           a[i]=String.valueOf(n) ;
           n++;
        }
        int year=����.get(Calendar.YEAR),
        month=����.get(Calendar.MONTH)+1;
        System.out.println(" "+year+"��"+month+"��"+"18��,�ձ������ֻ�ս��");
        System.out.printf("%4c%4c%4c%4c%4c%4c%4c\n",'��','һ','��', '��','��','��','��');    
        for(int i=0;i<a.length;i++){
           if(i%7==0&&i!=0)
              System.out.printf("\n");
           System.out.printf("%5s",a[i]);      
        } 
    } 
}