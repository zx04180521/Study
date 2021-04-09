package LeetCode;
/*最近请求的次数*/
import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_933 {
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));     // requests = [1]，范围是 [-2999,1]，返回 1
        System.out.println(recentCounter.ping(100));   // requests = [1, 100]，范围是 [-2900,100]，返回 2
        System.out.println(recentCounter.ping(3001));  // requests = [1, 100, 3001]，范围是 [1,3001]，返回 3
        System.out.println(recentCounter.ping(3002));  // requests = [1, 100, 3001, 3002]，范围是 [2,3002]，返回 3


    }
}
class RecentCounter {
    Queue<Integer> q=new LinkedList<>();
    public RecentCounter() {

    }

    public int ping(int t) {
        q.offer(t);
        while(q.peek()<t-3000){
            q.poll();
        }
        return q.size();
    }
}