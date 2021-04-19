package Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={9,5,2,7,4,6,3,8,5,2,7};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr){
        merge(arr,0,arr.length);

    }
    public static void merge(int[] arr,int left,int right){
        if(left>=right-1){
            return ;
        }
        int mid=(left+right)/2;
        merge(arr,left,mid);
        merge(arr,mid,right);
        _merge(arr,left,mid,right);
    }
    public static void _merge(int[] arr,int left,int mid,int right){
        int size=right-left;
        int[] newArr=new int[size];
        int l=left;
        int r=mid;
        int i=0;
        while(l<mid&&r<right){
            if(arr[l]<=arr[r]){
                newArr[i++]=arr[l++];
            }else{
                newArr[i++]=arr[r++];
            }
        }
        while(l<mid){
            newArr[i++]=arr[l++];
        }
        while(r<right){
            newArr[i++]=arr[r++];
        }
        for(int j=0;j<size;j++){
            arr[left+j]=newArr[j];
        }
    }
}
