package BitHomework;

import java.util.Arrays;

public class BZ12_20_01 {
    public static void main(String[] args) {
        //冒泡排序
//        int[] arr = {2, 5, 3, 6, 4, 7, 4};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));

        //数组拷贝
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr1 = Arrays.copyOf(arr, arr.length);
//        System.out.println("arr1:" + Arrays.toString(arr1));


//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(avg(arr));//求平均值
//        System.out.println(sum(arr));//求和
//        transform(arr);//数组元素乘二
//        System.out.println(Arrays.toString(arr));
//        printArray(arr);//foreach打印数组元素

//        int[] arr1 = new int[100];
//        for (int i = 0; i < 100; i++) {
//            arr1[i] = i + 1;
//        }
//        System.out.println(Arrays.toString(arr1));


    }

    //冒泡排序
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

    }

    //foreach打印数组元素
    private static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
    }
//数组元素乘二
    private static void transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * arr[i];
        }
    }
     //求和
    private static double sum(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum = sum + x;
        }
        return sum;
    }
     //求平均值
    private static double avg(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum = sum + x;
        }
        return sum / a.length;
    }

}
