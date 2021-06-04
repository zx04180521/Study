package DailyQuestions;

import java.util.Scanner;

//计算字符串的距离
public class Levenshtein {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.next();
            String str2=sc.next();
            int[][] res=new int[str1.length()+1][str2.length()+1];
            res[0][0]=0;//初始化
            for(int i=1;i<=str1.length();i++){
                //初始化第一列
                res[i][0]=res[i-1][0]+1;
            }
            for(int j=1;j<=str2.length();j++){
                //初始化第一行
                res[0][j]=res[0][j-1]+1;
            }
            for(int i=1;i<=str1.length();i++){
                for(int j=1;j<=str2.length();j++){
                    res[i][j]=Math.min(res[i-1][j],res[i][j-1])+1;
                    if(str1.charAt(i-1)==str2.charAt(j-1)){
                        //当前位置字符相等
                        res[i][j]=Math.min(res[i][j],res[i-1][j-1]);
                    }else{
                        //当前位置字符不相等
                        res[i][j]=Math.min(res[i][j],res[i-1][j-1]+1);
                    }
                }
            }
            System.out.println(res[str1.length()][str2.length()]);
        }
    }
}
