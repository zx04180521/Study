package Dp;
/*一个机器人在m×n大小的地图的左上角（起点）。
机器人每次向下或向右移动。机器人要到达地图的右下角（终点）。
可以有多少种不同的路径从起点走到终点？*/
public class PathSum_1 {
    public int uniquePaths (int m, int n) {
        // write code here
        if(m==0||n==0){
            return 0;
        }
        int[][] res=new int[m][n];
        for(int i=0;i<m;i++){
            //初始化第一列
            res[i][0]=1;
        }
        for(int i=0;i<n;i++){
            //初始化第一行
            res[0][i]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                //F(i,j)=F(i-1)(j)+F(i)(j-1)
                res[i][j]=res[i-1][j]+res[i][j-1];
            }
        }
        return res[m-1][n-1];
    }
}
