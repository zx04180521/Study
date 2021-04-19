package Sort;

import java.util.Arrays;
//快速排序
public class QuickSort {
    public static void main(String[] args) {
        int[] sum={1,7,9,4,6,5};
        sort(sum,0,sum.length-1);
        System.out.println(Arrays.toString(sum));
    }

    private static void sort(int[] sum, int left, int right) {
        int low=left;
        int high=right;
        int key=sum[low];
        while(low<high){
            while(low<right&&sum[high]>key){
                high--;
            }
            if(low<high){
                sum[low]=sum[high];
                low++;
            }

            while(low<high&&sum[low]<key){
                low++;
            }
            if(low<high){
            sum[high]=sum[low];
            high--;
            }

        }
        sum[high]=key;
        if(low-1>left)sort(sum,left,low-1);
        if(high+1<right)sort(sum,high+1,right);
    }
}
