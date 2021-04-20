package DailyQuestions;

import java.util.Scanner;

public class Candy {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] ary=new int[4];
        for(int i=0;i<4;i++){
            ary[i]=sc.nextInt();
        }
        candy(ary);
    }
    public static void candy(int[] ary){
        int A=(ary[0]+ary[2])/2;
        int B1=(ary[1]+ary[3])/2;
        int B2=(ary[2]-ary[0])/2;
        if(B1!=B2){
            //判断两个B是否相等
            System.out.println("No");
            return;
        }
        int C=(ary[3]-ary[1])/2;
        System.out.println(A+" "+B1+" "+C);
    }
}
