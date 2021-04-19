package Dp;
/*给出一个三角形，计算从三角形顶部到底部的最小路径和，每一步都可以移动到下面一行相邻的数字*/
import java.util.ArrayList;

public class Triangular {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                int curMin=triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1));
                triangle.get(i).set(j,curMin);
            }
        }
        return triangle.get(0).get(0);
    }
}
