package BitHomework;

import java.util.Arrays;

public class BZ12_20_02 {
    public static void main(String[] args) {



        //自己实现的数组转字符串
//        int[] arr3 = {1, 2, 3, 4, 5, 6};
//        System.out.println(toString(arr3));

        //二分查找
//        int[] arr={1,2,3,4,5,6};
//        System.out.println(binarySearch(arr,4));

        //判断是否有序
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        System.out.println(isSort(arr));
    }

    //判断是否有序
    private static boolean isSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }

        }
        return true;
    }


    //二分查找
    private static int binarySearch(int[] arr, int toFind) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (toFind < arr[mid]) {
                right = mid - 1;
            } else if (toFind > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    //自己实现的数组转字符串
    private static String toString(int[] arr) {
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i != arr.length - 1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }

}
