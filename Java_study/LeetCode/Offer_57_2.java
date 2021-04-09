package LeetCode;

import java.util.ArrayList;
import java.util.List;

/*和为s的连续整数序列*/
public class Offer_57_2 {
    public static void main(String[] args) {

    }
    public  int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<>();
        for (int r = 1, l = 1, sum = 0; r < target; r++) {
            sum += r;
            while (sum > target) {
                sum -= l++;
            }
            if (sum == target) {
                int[] temp=new int[r-l+1];
                int index=0;
                for (int i = l; i <= r; i++) {
                    temp[index++]=i;
                }
                list.add(temp);
            }
        }

        int[][] res = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            res[i]=list.get(i);
        }
        return res;
    }


//方法二
//    public  int[][] findContinuousSequence(int target) {
//        List<int[]> list = new ArrayList<>();
//        int sum=0;
//        int l=1;
//        int r=1;
//        while(l<=target/2){
//            if(sum<target){
//                sum+=r++;
//            }else if(sum>target){
//                sum-=l++;
//            }else{
//                int[] temp=new int[r-l];
//                int index=0;
//                for(int i=l;i<r;i++){
//                    temp[index++]=i;
//                }
//                list.add(temp);
//                sum-=l++;
//            }
//
//        }
//        int[][] res = new int[list.size()][];
//        for (int i = 0; i < list.size(); i++) {
//            res[i]=list.get(i);
//        }
//        return res;
//    }
}
