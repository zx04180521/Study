package DailyQuestions;

import java.util.Scanner;

public class FirstChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            int[] res=new int[128];//新数组
            char[] c=str.toCharArray();
            for(int i=0;i<c.length;i++){
                //c[i]对应的字符出现一次就让在新数组中以c[i]为下标的位置元素加一
                res[c[i]]++;
            }
            boolean b=true;//标志是否找到值出现一次的元素
            for(int i=0;i<c.length;i++){
                if(res[c[i]]==1){
                    b=false;//找到了
                    System.out.println(c[i]);//打印该元素
                    break;
                }
            }
            if(b==true){
                //没找到
                System.out.println(-1);
            }
        }
    }
}
