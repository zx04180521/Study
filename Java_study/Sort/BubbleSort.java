package Sort;
/*冒泡排序*/
import java.util.Arrays;

import static Sort.Swap.swap;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={9,5,2,7,3,8,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        for(int bound=0;bound<arr.length;bound++){
            for(int cur=arr.length-1;cur>bound;cur--){
                if(arr[cur-1]>arr[cur]){
                    swap(arr,cur-1,cur);
                }
            }
        }
    }
}
