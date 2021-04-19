package Sort;

import java.util.Arrays;

import static Sort.MergeSort._merge;

public class MergeSortByLoop {
    public static void main(String[] args) {
        int[] arr={9,5,2,7,4,6,3,8,5,2,7};
        mergeSortByLoop(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSortByLoop(int[] arr){
        //gap控制每个待归并数组长度
        for(int gap=1;gap<arr.length;gap*=2){
            for(int i=0;i<arr.length;i+=2*gap){
                int left=i;
                int mid=i+gap;
                if(mid>=arr.length){
                    mid=arr.length;
                }
                int right=i+2*gap;
                if(right>=arr.length){
                    right=arr.length;
                }
                _merge(arr,left,mid,right);
            }
        }
    }
}
