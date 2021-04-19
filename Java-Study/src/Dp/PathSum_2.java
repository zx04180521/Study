package Dp;
/*继续求路径。
如果在图中加入了一些障碍，有多少不同的路径？
分别用0和1代表空区域和障碍
[
    [0,0,0],
    [0,1,0],
    [0,0,0]
]
有2条不同的路径*/
public class PathSum_2 {
    public int uniquePathsWithObstacles (int[][] obstacleGrid) {
        // write code here
        int line=obstacleGrid.length;
        int list=obstacleGrid[0].length;
        int[][] res=new int[line][list];
        for(int i=0;i<list;i++){
            //初始化第一行
            if(obstacleGrid[0][i]==0){
                res[0][i]=1;
            }else{
                //当obstacleGrid[0][i]=1，说明遇到了障碍，
                // 不必往后初始化，后面都是默认值0
                break;
            }
        }
        for(int i=0;i<line;i++){
            //初始化第一列
            if(obstacleGrid[i][0]==0){
                res[i][0]=1;
            }else{
                //当obstacleGrid[i][0]=1，说明遇到了障碍，
                // 不必往后初始化，后面都是默认值0
                break;
            }
        }
        for(int i=1;i<line;i++){
            for(int j=1;j<list;j++){
                if(obstacleGrid[i][j]==1){
                    //当obstacleGrid[i][0]=0，说明遇到了障碍，
                    // 则直接跳过该位置的路径，直接是默认值0
                    continue;
                }
                // F(i,j) = F(i-1,j) + F(i,j-1)}
                res[i][j]=res[i-1][j]+res[i][j-1];
            }
        }
        return res[line-1][list-1];
    }
}
