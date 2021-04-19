package Dp;
/*带权值的最小路径和*/
public class PathSum_3 {
    public int minPathSum (int[][] matrix) {
        // write code here
        int line =matrix.length;
        if(line==0){
            return 0;
        }
        int list=matrix[0].length;
        int[][] res=new int[line][list];//存放当前位置的最小路径和
        for(int i=0;i<line;i++){
            //初始化第一列
            if(i==0){
                res[i][0]=matrix[i][0];
            }
            else{
                res[i][0]=res[i-1][0]+matrix[i][0];
            }
        }
        for(int i=1;i<list;i++){
            //初始化第一行
            res[0][i]=res[0][i-1]+matrix[0][i];
        }
        for(int i=1;i<line;i++){
            for(int j=1;j<list;j++){
                //状态转移方程： F(i,j)=F(i,j)+min(F(i,j-1),F(i-1,j))
                res[i][j]=Math.min(res[i-1][j],res[i][j-1])+matrix[i][j];
            }
        }
        return res[line-1][list-1];
    }
}
