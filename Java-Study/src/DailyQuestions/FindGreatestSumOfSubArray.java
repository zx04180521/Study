package DailyQuestions;

public class FindGreatestSumOfSubArray {

    public int findGreatestSumOfSubArray(int[] array) {
        //初始化curSum,maxSum
        int curSum=array[0];
        int maxSum=array[0];
        for(int i=1;i<array.length;i++){
            curSum=Math.max(curSum+array[i],array[i]);//记录子数组的和
            maxSum=Math.max(curSum,maxSum);//记录当前最大值
        }
        return maxSum;
    }
}
