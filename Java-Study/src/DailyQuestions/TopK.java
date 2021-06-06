package DailyQuestions;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TopK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while(sc.hasNext()){
            list.add(sc.nextInt());//获取输入的数字
        }
        topK(list);
    }
    public static void topK(ArrayList<Integer> list){
        PriorityQueue<Integer> qu=new PriorityQueue<>(list.size()-1);//优先级队列
        int k=list.get(list.size()-1);//得到K
        for(int i=0;i<list.size()-1;i++){
            qu.offer(list.get(i));//将除去K的数字插入到优先级队列中
        }
        for(int i=0;i<k;i++){
            System.out.print(qu.poll()+" ");//获取前k个数并输出
        }
    }
}
