package Priority;

import java.util.PriorityQueue;

public class PriorityQue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] arr = {9, 5, 2, 7};
        for (int x : arr) {
            queue.offer(x);
        }
        while (!queue.isEmpty()) {
            Integer x = queue.poll();
            System.out.println(x);
        }
    }

}
