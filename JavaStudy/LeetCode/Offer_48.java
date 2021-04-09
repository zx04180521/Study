package LeetCode;

import com.sun.xml.internal.ws.api.pipe.ServerTubeAssemblerContext;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Offer_48 {
    public static void main(String[] args) {

    }
    public static int lengthOfLongestSubstring(String s) {
        Deque<Character> deque=new LinkedList<>();
        int curMax=0;
        int length=s.length();
        for(int i=0;i<length;i++){
            char c=s.charAt(i);
            while(deque.contains(c)){
                deque.removeFirst();;
            }
            deque.offerLast(c);
            curMax=Math.max(curMax,deque.size());
        }
        return curMax;
    }

    //方法二
    public static int lengthOfLongestSubstring_2(String s) {
        Set<Character> set=new HashSet<>();
        int length=s.length();
        int curMax=0;
        int l=0;
        for(int i=0;i<length;i++){
            char c=s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(l++));
            }
            set.add(c);
            curMax=Math.max(curMax,i-l+1);
        }
        return curMax;
    }
}
