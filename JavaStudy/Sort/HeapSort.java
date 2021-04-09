package Sort;

import java.util.Arrays;

import static Sort.Swap.swap;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 7, 4, 8, 3};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr) {
        creatHeap(arr);
        int heapSize = arr.length;
        for (int i = 0; i < arr.length; i++) {
            swap(arr, 0, heapSize-1);
            heapSize--;
            shiftDown(arr, 0, heapSize);
        }
    }

    public static void creatHeap(int[] arr) {
        for (int i = (arr.length - 1 - 1) / 2; i >= 0; i--) {
            shiftDown(arr, i, arr.length);
        }
//        for(int i=arr.length-1;i>=0;i--){
//            shiftUp(arr,i);
//        }
    }


    public static void shiftDown(int[] arr, int i, int size) {
        int parent = i;
        int child = 2 * parent + 1;
        while (child < size) {
            if (child + 1 < size && arr[child + 1] > arr[child]) {
                child = child + 1;
            }
            if (arr[parent] < arr[child]) {
                swap(arr, parent, child);
            } else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }

    public static void shiftUp(int[] arr, int i) {
        int child = i;
        int parent = (child - 1) / 2;
        while (child > 0) {
            if (arr[child] > arr[parent]) {
                swap(arr, child, parent);
            } else {
                break;
            }
            child = parent;
            parent = (child - 1) / 2;
        }
    }
}
