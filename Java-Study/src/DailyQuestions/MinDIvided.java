package DailyQuestions;

import java.util.Scanner;

/*分割排序子序列
牛牛定义排序子序列为一个数组中一段连续的子序列,
并且这段子序列是非递增或者非递减排序的。
牛牛有一个长度为n的整数数组A,他现在有一个任务是把数组A分为若干段排序子序列,
牛牛想知道他最少可以把这个数组分为几段排序子序列*/
public class MinDIvided {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] ary=new int[length];
        int index=0;
        while(sc.hasNext()){
            ary[index++]=sc.nextInt();
        }
        int res=minDivide_2(ary,length);
        System.out.println(res);
    }
    public static int minDivide_2(int[] ary,int length){
        int count=0;
        int cur=1;
        if(length<=2){
            return 1;
        }
        for(;cur<length-1;cur++){
            if((ary[cur-1]<ary[cur]&&ary[cur]>ary[cur+1])
                    ||(ary[cur-1]>ary[cur]&&ary[cur]<ary[cur+1])){
                count++;
                if(cur!=length-3){
                    cur++;
                }
            }
        }
        count++;
        return count;
    }
}
