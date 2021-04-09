package Sort;

import java.util.Arrays;

import static Sort.Swap.swap;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr={9,5,2,7,4,8,5,2,7};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void select(int[] arr){
        for(int bound=0;bound<arr.length;bound++){
            for(int cur=bound+1;cur<arr.length;cur++){
                if(arr[cur]<arr[bound]){
                    swap(arr,cur,bound);
                }
            }
        }
    }
}
