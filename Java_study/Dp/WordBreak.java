package Dp;

import java.util.Set;

public class WordBreak {
    public static void main(String[] args) {

    }
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] res=new boolean[s.length()+1];//储存当前位置是否能被分割
        for(int i=1;i<=s.length();i++){
            if(dict.contains(s.substring(0,i))){
                //判断当前位置之前的字符串是否存在dict中，
                //如果存在,则在res[]中记录true，表示当前位置可以分割
                res[i]=true;
                continue;
            }
            //如果程序能够执行到这里，表示当前位置之前的字符串不存在dict中，
            //则判断是否可以继续分割成更短的字符串
            for(int j=i-1;j>0;j--){
                if(res[j]&&dict.contains(s.substring(j,i))){
                    //该循环条件表示j位置之前的字符串存在dict中，并且j~i长度的字符串也存在dict中
                    //则在位置就赋值为true，表示可以在此分割
                    res[i]=true;
                    break;
                }
            }
        }
        //返回res的最后一个值，
        //如果是true表示字符串s可以分割成所有子串都在dict中
        return res[s.length()];
    }
}
