package LeetCode;
/*最长回文子串*/
public class LeetCode_5 {
    public static void main(String[] args) {

    }
    public String longestPalindrome(String s) {
        int length=s.length();
        char[] ary=s.toCharArray();
        boolean[][] res=new boolean[length][length];
        for(int i=0;i<length;i++){
            res[i][i]=true;
        }
        int max=1;
        int start=0;
        for(int j=1;j<length;j++){
            for(int i=j-1;i>=0;i--){
                if(ary[i]!=ary[j]){
                    res[i][j]=false;
                }else{
                    if(j-i<2||res[i+1][j-1]){
                        res[i][j]=true;
                    }
                }
                if(j-i+1>max&&res[i][j]){
                    max=j-i+1;
                    start=i;
                }
            }
        }
        return s.substring(start,start+max);

    }
}
