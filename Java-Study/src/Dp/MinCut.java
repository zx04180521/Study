package Dp;
/*给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是回文。
返回符合要求的 最少分割次数 。*/
//方法一：
public class MinCut {

    public int minCut(String s) {
        // write code here
        int length = s.length();
        int[] res = new int[length + 1];
        for (int i = 0; i <= length; i++) {
            //初始化
            res[i] = i - 1;
        }
        for (int i = 1; i <= length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                //判断从j到i位置的字符串是不是回文串
                if (isP(s.substring(j, i))) {
                    //F(i) = min{F(j)+1,F(i)},
                    res[i] = Math.min(res[j] + 1, res[i]);
                }
            }
        }
        return res[length];
    }

    //判断回文
    public static boolean isP(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            //当left位置和right位置元素不相等，则不是回文串，返回false
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        //while循环结束表示没有找到不相等的位置，则是回文串
        return true;
    }
}

