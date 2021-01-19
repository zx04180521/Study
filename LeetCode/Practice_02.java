package LeetCode;

public class Practice_02 {
    public static void main(String[] args) {
        //输入一个整数（以二进制串形式），输出该数二进制表示中 1 的个数。
        int a=5;
        System.out.println(hammingWeight(a));

    }

    //输入一个整数（以二进制串形式），输出该数二进制表示中 1 的个数。
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

}
