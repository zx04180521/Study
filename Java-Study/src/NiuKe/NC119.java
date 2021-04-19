package NiuKe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/*最小的k个数*/
public class NC119 {
    public static void main(String[] args) {
        int[] ary = {4, 5, 1, 6, 2, 7, 3, 8};
        System.out.println(GetLeastNumbers_Solution(ary, 4));
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        if (k > input.length) {
            return list;
        }
        Arrays.sort(input);
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;

    }


    public ArrayList<Integer> GetLeastNumbers_Solution_2(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (k > input.length) {
            return list;
        }
        PriorityQueue qu = new PriorityQueue();
        for (int a : input) {
            qu.offer(a);
        }
        for (int i = 0; i < k; i++) {
            list.add((int) qu.poll());
        }
        return list;

    }
}
