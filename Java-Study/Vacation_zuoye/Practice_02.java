package Vacation_zuoye;

import java.util.Arrays;

public class Practice_02 {
    public static void main(String[] args) {
        char[] a = {'a', 'a', 'e', 'e', 'c'};
        System.out.println(compress(a));
    }
    public static int compress(char[] chars) {
        int current = 0, write = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                chars[write++] = chars[current];
                if (read > current) {
                    for (char c: ("" + (read - current + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                current = read + 1;
            }
        }
        return write;
    }

}
