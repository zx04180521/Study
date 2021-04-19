package LeetCode;

import java.util.HashSet;
import java.util.Set;

/*无重复字符的最长子串*/
public class LeetCode {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int l=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(l++));
            }
            set.add(c);
            max=Math.max(max,set.size());
        }
        return max;
    }
}
