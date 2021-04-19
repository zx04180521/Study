package Sort;

import java.util.Arrays;
import java.util.Stack;

import static Sort.QuickSort.partition;

public class QuickSortByLoop {
    public static void main(String[] args) {
        int[] arr={9,5,2,7,4,6,3,8,5,2,7};
        quickSortByLoop(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSortByLoop(int[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(arr.length-1);
        while(!stack.isEmpty()){
            int right=stack.pop();
            int left=stack.pop();
            if(left>=right){
               continue;
            }
            int index=partition(arr,left,right);
            stack.push(left);
            stack.push(index-1);
            stack.push(index+1);
            stack.push(right);
        }
    }
}
