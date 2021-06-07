package DailyQuestions;

import java.util.Scanner;

//洗牌
public class shufflePoker {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        while(sc.hasNext()){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] ary=new int[2*n];
            for(int i=0;i<2*n;i++){
                ary[i]=sc.nextInt();
            }
            for(int i=0;i<k;i++){
                poker(ary);
            }
            for(int i=0;i<ary.length-1;i++){
                System.out.print(ary[i]+" ");
            }
            System.out.println(ary[2*n-1]);
        }
    }
    public static void poker(int[] ary){
        int[] newAry=new int[ary.length];
        int index=0;
        for(int i=0;i<ary.length;i+=2){
            newAry[i]=ary[index++];
        }
        for(int i=1;i<ary.length;i+=2){
            newAry[i]=ary[index++];
        }
        for(int i=0;i<ary.length;i++){
            ary[i]=newAry[i];
        }
    }
}
