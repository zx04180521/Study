package LeetCode;

public class Practice_01 {
    public static void main(String[] args) {
        System.out.println(numWays(6));
    }
    public static int numWays(int n) {
        int a = 1;
        int b = 1;
        int c = 0;

        if (n < 2) return 1;
        else {
            for (int j = 0; j < n - 1; j++) {
                c = a + b;
                a = b;
                b = c % 1000000007;
            }
        }
        return b;
    }
}
