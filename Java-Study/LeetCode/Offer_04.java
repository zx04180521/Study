package LeetCode;
/*
二位数组查找元素
在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，
输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
。*/
public class Offer_04 {
    public static void main(String[] args) {
        int[][] matrix={{1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}};
        System.out.println(findNumberIn2DArray(matrix,5));
    }
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row=matrix.length;
        if(row==0){
            return false;
        }
        int list=matrix[0].length;
        int left=0;
        int right=list-1;
        while(left<row&&right>=0){
            if(matrix[left][right]>target){
                right--;
            }else if(matrix[left][right]<target){
                left++;
            }else{
                return true;
            }
        }
        return false;
    }
}
