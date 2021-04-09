package LeetCode;
/*最小的k个数*/
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Offer_40 {
    public static void main(String[] args) {
        int[] arr={9,5,2,7,4,8,3,6};
        System.out.println(Arrays.toString(getLeastNumbers(arr,4)));
    }
    public static int[] getLeastNumbers(int[] arr, int k) {
        if(arr==null||k<=0){
            return new int[0];
        }
        Queue<Integer> queue=new PriorityQueue<>(arr.length);
        for(int i=0;i<arr.length;i++){
            queue.offer(arr[i]);
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=queue.poll();
        }
        return res;
    }
}
