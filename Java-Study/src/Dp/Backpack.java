package Dp;
/*有 n 个物品和一个大小为 m 的背包.
 给定数组 A 表示每个物品的大小和数组 V 表示每个物品的价值.
输入: m = 10, A = [2, 3, 5, 7], V = [1, 5, 2, 4]
输出: 9
解释: 装入 A[1] 和 A[3] 可以得到最大价值, V[1] + V[3] = 9 */
public class Backpack {

    public int backPackII(int m, int[] A, int[] V) {
        // write your code here
        int[][] res=new int[A.length+1][m+1];
        for(int i=1;i<res.length;i++){
            for(int j=1;j<res[0].length;j++){
                if(A[i-1]<=j){
                    res[i][j]=Math.max(res[i-1][j],res[i-1][j-A[i-1]]+V[i-1]);
                }else{
                    res[i][j]=res[i-1][j];
                }
            }
        }
        return res[A.length][m];
    }

    public int backPackII_2(int m, int[] A, int[] V) {
        // write your code here
        int[] res=new int[m+1];
        for(int i=1;i<=A.length;i++){
            for(int j=m;j>0;j--){
                if(A[i-1]<=j){
                    res[j]=Math.max(res[j],res[j-A[i-1]]+V[i-1]);
                }
            }
        }
        return res[m];
    }
}
