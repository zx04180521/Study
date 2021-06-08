package Dp;
/*给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是回文。
返回符合要求的 最少分割次数 。*/
//方法二：
public class MinCut2 {
    public int minCut(String s) {
        int length=s.length();
        boolean[][] matrix=isP(s);
        int[] res=new int[length+1];
        for(int i=0;i<=length;i++){
            res[i]=i-1;
        }
        for(int i=1;i<=length;i++){
            for(int j=i-1;j>=0;j--){
                if(matrix[j][i-1]){
                    res[i]=Math.min(res[i],res[j]+1);
                }
            }
        }
        return res[length];
    }
    //返回判断回文串的二位数组
    public static boolean[][] isP(String s){
        char[] c=s.toCharArray();
        int length=s.length();
        boolean[][] res=new boolean[length][length];
        for(int i=0;i<length;i++){
            //初始化，只有一个元素时，直接是回文串
            res[i][i]=true;
        }
        for(int i=1;i<length;i++){
            for(int j=i-1;j>=0;j--){
                if(c[i]!=c[j]){
                    //两个位置元素不相等
                    res[j][i]=false;
                }else{
                    //两个位置元素不相等
                    if(res[j+1][i-1]||i-j<3){
                        //1.执行到这个else if 表示chars[i]=chars[j]
                        //2.条件i-j<3表示在1的条件下，当前子串只有3个元素，为回文串
                        //3.当res[j+1][i-1]为true时，当前子串为回文串，
                        //  因为D(i,j)是否是回文串依赖于 D(i+1,j-1),
                        res[j][i]=true;
                    }else{
                        res[j][i]=false;
                    }
                }
            }
        }
        return res;
    }
}
