package LeetCode;

public class Leetcode_718 {
    public static void main(String[] args) {
        int[] A={2,1,3,4,5};
        int[] B={3,4,5,1,2};
        System.out.println(findLength(A,B));
    }
    public static int  findLength(int[] A, int[] B) {
        int lenA=A.length;
        int lenB=B.length;

        int[][] temp=new int[lenA+1][lenB+1];
        int cur=0;
        for(int i=1;i<=lenA;i++){
            for(int j=1;j<=lenB;j++){
                if(A[i-1]==B[j-1]){
                    temp[i][j]=temp[i-1][j-1]+1;

                }
                cur=Math.max(cur,temp[i][j]);
            }
        }
        return cur;
    }
}
