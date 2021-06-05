package DailyQuestions;
/*迷宫问题

定义一个二维数组N*M（其中2<=N<=10;2<=M<=10），如5 × 5数组下所示：

int maze[5][5] = {
0, 1, 0, 0, 0,
0, 1, 0, 1, 0,
0, 0, 0, 0, 0,
0, 1, 1, 1, 0,
0, 0, 0, 1, 0,
};

它表示一个迷宫，其中的1表示墙壁，0表示可以走的路，只能横着走或竖着走，不能斜着走，
要求编程序找出从左上角到右下角的最短路线。入口点为[0,0],既第一空格是可以走的路。*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node{
    int x;
    int y;
    public Node(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class Maze {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int row=sc.nextInt();
            int col=sc.nextInt();
            //创建迷宫矩阵
            int[][] matrix=new int[row][col];
            //读入迷宫数据
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }
            //标记位置是否被走过
            int[][] book=new int[row][col];
            //搜索最短路径
            List<Node> path=new ArrayList<>();
            List<Node> minPath=new ArrayList<>();
            getMinPath(matrix,row,col,path,minPath,book,0,0);
            for(Node a:minPath){
                System.out.println("("+a.x+","+a.y+")");
            }
        }
    }

    //matrix：迷宫矩阵
    //x，y：当前位置
    //book：标记矩阵，标记当前位置是否走过
    //path:保存当前路径的每一个位置
    //minPath: 保存最短路径
    public static void getMinPath(int[][] matrix,int row,int col,
                                  List<Node> path,List<Node> minPath,
                                  int[][] book,int x,int y){
        if(x<0||x>=row||y<0||y>=col||book[x][y]==1||matrix[x][y]==1){
            //判断x，y是否越界，是否走过，是否有障碍
            return;
        }
        //吧位置存入路径中
        path.add(new Node(x,y));
        //标记已经被走过
        book[x][y]=1;
        //判断是否是出口
        if(x==row-1&&y==col-1){
            //一条新路径的产生
            //判断是否是更短路径
            if(minPath.isEmpty()||path.size()<minPath.size()){
                //更新更短路径
                minPath.clear();
                for(Node n : path){
                    minPath.add(n);
                }
            }
        }
        //继续搜索(x,y)的上下左右四个方向
        getMinPath(matrix,row,col,path,minPath,book,x+1,y);
        getMinPath(matrix,row,col,path,minPath,book,x-1,y);
        getMinPath(matrix,row,col,path,minPath,book,x,y-1);
        getMinPath(matrix,row,col,path,minPath,book,x,y+1);
        //把当前位置从路径中删除，寻找新的路径
        path.remove(path.size() - 1);
        book[x][y] = 0;
    }
}
