package six;

import java.util.*;
public class Example6_12 {
   @SuppressWarnings({ "resource", "unused" })
public static void main(String args[]) {
      String cost = "�л��ѣ�176.89Ԫ����;�ѣ�187.98Ԫ������ѣ�928.66Ԫ";
      Scanner scanner = new Scanner(cost);
      scanner.useDelimiter("[^0123456789.]+"); 
      double sum=0;
      while(scanner.hasNext()){
         try{
              double price=scanner.nextDouble();
              sum=sum+price;
              System.out.println(price);
         } 
         catch(InputMismatchException exp){
              String t=scanner.next();
         }   
      }
      System.out.println("��ͨ�ŷ���:"+sum+"Ԫ");
   }
}