package DailyQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*输出一个整数，表示所有队伍的水平值做大和*/
public class MaxLevel {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        while (sc.hasNext()) {
//            list.add(sc.nextInt());
//
//        }
//        maxLevel(list);


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ary=new int[3*n];
//        Long index= Long.valueOf(0);
//        while(sc.hasNext()){
//            ary[index++]=sc.nextLong();
//        }
        for(int i=0;i<ary.length;i++){
            ary[ i]=sc.nextInt();
        }
        Arrays.sort(ary);
        int max = 0;
        int cur = ary.length - 2;
        for (int i = 0; i < n; i++) {
            max += ary[cur];
            cur -= 2;
        }
        System.out.println(max);

    }

    public static void maxLevel(ArrayList<Integer> list) {
        int n = list.remove(0);
        int[] arr = new int[list.size()];
        int index = 0;
        while (!list.isEmpty()) {
            arr[index++] = list.remove(0);
        }
        Arrays.sort(arr);
        int max = 0;
        int cur = arr.length - 2;
        for (int i = 0; i < n; i++) {
            max += arr[cur];
            cur -= 2;
        }
        System.out.println(max);
    }
}