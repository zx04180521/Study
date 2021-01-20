package BitHomework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BZ01_19 {
    public static void main(String[] args) {
        //实现方法 split, 能够指定分割符将字符串拆分成字符串数组(不必支持正则表达式)
//        String str ="hello world";
//        split(str," ");


        //实现方法 indexOf, 能够找出字符串子串存在的位置
//        String str="Hello wworld";
//        System.out.println( indexOf(str,"wo"));


        // 实现方法 contains, 能够判定字符串中是否包含子串
//        String str = "Hello world";
//        System.out.println(contains(str,"wo"));


       // 实现方法 compareTo, 能够实现按照字典序比较字符串大小
        String str1="Hello";
        String str2="hello";
        System.out.println( compareTo(str1,str2));
    }

    private static int compareTo(String str1, String str2) {
        char[] a1=str1.toCharArray();
        char[] a2=str2.toCharArray();
        int k=0;
        while(k<a1.length||k<a2.length){
            if(a1[k]!=a2[k]){
                return a1[k]-a2[k];
            }
            k++;
        }
        return Math.abs(a1.length-a2.length);

    }

    // 实现方法 contains, 能够判定字符串中是否包含子串
    public static boolean contains(String str, String s) {

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if ((String.valueOf(s.charAt(0))).equals(String.valueOf(str.charAt(i)))) {
                int m=i;
                for (int j = 0; j < s.length(); j++) {

                    if ((String.valueOf(s.charAt(j))).equals(String.valueOf(str.charAt(m++)))) {
                        count++;
                    }
                    if (count == s.length()) {
                        return true;
                    }

                }
            }
        }
        return false;
    }

    //实现方法 indexOf, 能够找出字符串子串存在的位置
    public static int indexOf(String str, String s) {

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if ((String.valueOf(s.charAt(0))).equals(String.valueOf(str.charAt(i)))) {
                int m=i;
                for (int j = 0; j < s.length(); j++) {

                    if ((String.valueOf(s.charAt(j))).equals(String.valueOf(str.charAt(m++)))) {
                        count++;
                    }
                    if (count == s.length()) {
                        return m - s.length();
                }

                }
            }
        }
        return -1;
    }


    //实现方法 split, 能够指定分割符将字符串拆分成字符串数组(不必支持正则表达式)
    private static void split(String str, String s) {
        int count = 0;
//统计字符串中目标分割符的次数
        for (int i = 0; i < str.length(); i++) {
            if (s.equals(String.valueOf(str.charAt(i)))) {
                count++;
            }
        }
        String[] result = new String[++count];
        Arrays.fill(result, "");
        int t = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!s.equals(String.valueOf(str.charAt(i)))) {
                result[t] += str.charAt(i);
            } else {
                //遇到分隔符，数组下表后移
                t++;
            }
        }
        System.out.println(Arrays.toString(result));
    }


}



