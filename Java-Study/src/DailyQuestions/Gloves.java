package DailyQuestions;

public class Gloves {
    public int findMinimum(int n, int[] left, int[] right) {
        // write code here
        int sum=0;
        int leftMin=Integer.MAX_VALUE;//左手手套颜色最少的个数
        int rightMin=Integer.MAX_VALUE;//右手手套颜色最少的个数
        int rightSum=0;//右手手套和
        int leftSum=0;//左手手套和
        for(int i=0;i<n;i++){
            if(left[i]*right[i]==0){
                //这个颜色的左手或右手个数为0
                sum+=left[i]+right[i];
            }else{
                rightSum+=right[i];//计算右手手套和
                leftSum+=left[i];//计算左手手套和
                rightMin=Math.min(right[i],rightMin);//右手手套颜色最少的个数
                leftMin=Math.min(left[i],leftMin);//左手手套颜色最少的个数
            }
        }
        return sum+Math.min(leftSum-leftMin+1,rightSum-rightMin+1)+1;
    }
}
