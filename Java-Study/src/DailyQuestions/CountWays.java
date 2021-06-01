package DailyQuestions;

public class CountWays {
    public int countWays(int x, int y) {
// write code here
        int[][] res=new int[x][y];//记录返回值的数组
        for(int i=0;i<x;i++){
            res[i][0]=1;//数据初始化
        }
        for(int i=0;i<y;i++){
            res[0][i]=1;//数据初始化
        }
        for(int i=1;i<x;i++){
            for(int j=1;j<y;j++){
                res[i][ j]=res[i-1][j]+res[i][j-1];//状态转移方程
            }
        }
        return res[x-1][y-1];
    }
}
