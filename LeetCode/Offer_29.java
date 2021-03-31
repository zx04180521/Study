package LeetCode;
/*顺时针打印矩阵*/
import java.util.Arrays;

public class Offer_29 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(spiralOrder(arr)));
    }
    public static int[] spiralOrder(int[][] matrix) {
        int row=matrix.length;
        if(row==0){
            return new int[0];
        }
        int list=matrix[0].length;
        int[] res=new int[list*row];
        int index=0;
        int left=0;
        int right=list-1;
        int up=0;
        int down=row-1;
        while(true){
            for(int i=left;i<=right;i++){
                res[index++]=matrix[up][i];
            }
            if(++up>down){
                break;
            }
            for(int i=up;i<=down;i++){
                res[index++]=matrix[i][right];
            }
            if(--right<left){
                break;
            }
            for(int i=right;i>=left;i--){
                res[index++]=matrix[down][i];
            }
            if(--down<up){
                break;
            }
            for(int i=down;i>=up;i--){
                res[index++]=matrix[i][left];
            }
            if(++left>right){
                break;
            }
        }
        return res;
    }
}
