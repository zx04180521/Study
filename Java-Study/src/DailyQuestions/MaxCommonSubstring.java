package DailyQuestions;

import java.util.Scanner;

public class MaxCommonSubstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.next();
            String str2=sc.next();
            if(str1.length()>str2.length()){
                //是Str1 始终是较短的字符串，方便记录
                String temp=str1;
                str1=str2;
                str2=temp;
            }
            char[] c1=str1.toCharArray();
            char[] c2=str2.toCharArray();
            int[][] dp =new int[c1.length+1][c2.length+1];
            for(int i=0;i<=c1.length;i++){
                //初始化第一列
                dp[i][0]=0;
            }
            for(int j=0;j<=c2.length;j++){
                //初始化第一行
                dp[0][j]=0;
            }
            int end=0;//记录最长公共子串的结束位置
            int maxLen=0;//记录最长公共子串的长度
            for(int i=1;i<=c1.length;i++){
                for(int j=1;j<c2.length;j++){
                    if(c1[i-1]==c2[j-1]){
                        //当c1[i-1]==c2[j-1]时，dp[i][j]=dp[i-1][j-1]+1
                        dp[i][j]=dp[i-1][j-1]+1;
                        if(dp[i][j]>maxLen){
                            maxLen=dp[i][j];
                            end=i;
                        }
                    }
                }
            }
            System.out.println(str1.substring(end-maxLen,end));
        }
    }
}
