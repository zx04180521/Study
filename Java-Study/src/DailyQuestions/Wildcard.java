package DailyQuestions;

import java.util.Scanner;

public class Wildcard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.next();
            String str2=sc.next();
            //存放每一个位置状态的数组
            boolean[][] dp =new boolean[str1.length()+1][str2.length()+1];
            dp[0][0]=true;//初始化
            //初始化
            for(int i=1;i<dp.length;i++){
                dp[i][0]=dp[i-1][0]&&str1.charAt(i-1)=='*';
            }
            for(int i=1;i<dp.length;i++){
                for(int j=1;j<dp[0].length;j++){
                    if(str1.charAt(i-1)=='*'){
                        //当前位置带有通配符的字符串对应的字符是*
                        dp[i][j]=dp[i-1][j]||dp[i][j-1];
                    }else if(str1.charAt(i-1)=='?'){
                        //当前位置带有通配符的字符串对应的字符是?
                        dp[i][j]=dp[i-1][j-1];
                    }else{
                        //当前位置带有通配符的字符串对应的字符是字母
                        dp[i][j]=dp[i-1][j-1]&&str1.charAt(i-1)==str2.charAt(j-1);
                    }
                }
            }
            System.out.println(dp[str1.length()][str2.length()]);
        }
    }
}

