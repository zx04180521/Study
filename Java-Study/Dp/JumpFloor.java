package Dp;
/*青蛙跳台阶*/
public class JumpFloor {
    public static void main(String[] args) {

    }


    public int numWays(int n) {
        if (n <= 1) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return c;
    }

    public int numWays_2(int n) {
        // 初始值
        if (n <= 1) {
            return 1;
        }
        // F(n)=F(n-1)+F(n-2)
        return numWays_2(n - 1) + numWays_2(n - 2);
    }

}
