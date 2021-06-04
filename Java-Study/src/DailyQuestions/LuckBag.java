package DailyQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class LuckBag {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n =sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int num=count(a,n,0,0,1);
            System.out.println(num);
        }
    }
    public static int count(int[] a,int n,int pos,int sum,int multi){
        int count=0;
        for(int i=pos;i<n;i++){
            sum+=a[i];
            multi*=a[i];
            if(sum>multi){
                //是幸运的袋子
                count=count+1+count(a,n,i+1,sum,multi);
            }else if(a[i]==1){
                //当前值是1，可以往下进行一次遍历
                count=count+count(a,n,i+1,sum,multi);
            }else{
                break;
            }
            //回溯
            sum=sum-a[i];
            multi=multi/a[i];
            //剪枝
            while(i<n-1 && a[i]==a[i+1]){
                i++;
            }
        }
        return count;
    }
}

