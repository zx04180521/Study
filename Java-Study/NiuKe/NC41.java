package NiuKe;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/*最长无重复子串*/
public class NC41 {
    public static void main(String[] args) {

    }
    public int maxLength (int[] arr) {
        Set<Integer> set=new HashSet<>();
        int l=0;
        int max=0;
        for(int r=0;r<arr.length;r++){
            int temp=arr[r];
            while(set.contains(temp)){
                set.remove(arr[l++]);
            }
            set.add(temp);
            max=Math.max(max,set.size());
        }
        return max;
    }

    public int maxLength_2(int[] arr) {
        // write code here
        Deque<Integer> de=new LinkedList<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            while(de.contains(temp)){
                de.removeFirst();
            }
            de.addLast(temp);
            max=Math.max(max,de.size());
        }
        return max;
    }
}
