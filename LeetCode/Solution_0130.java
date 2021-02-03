package LeetCode;

public class Solution_0130 {
    public static void main(String[] args) {
        findContinuousSequence(8);
        System.out.println();
    }
    public static int[][] findContinuousSequence(int target){
        int l=1,r=1;
        int sum=0;
        int cur=1;
        int result[][]=new int[10][];
        for(;l<target/2;r++){
            sum+=r;
            if(sum>target){
                sum-=l;
                l++;
            }
            if(sum==target){
                int tmp[]=new int[r-l+1];
                int m=0;
                for(int i=0;i<r-l+1;i++){
                    tmp[i]=i+l;
                    result[m][cur]=i+l;
                    cur++;
                }
                m++;
            }
        }
        return result;
    }
}
