package LeetCode;
/*青蛙跳台阶问题*/
/*一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。
求该青蛙跳上一个 n 级的台阶总共有多少种跳法。

答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
*/
public class Offer_10_2 {
    public static void main(String[] args) {

    }
    public int numWays(int n) {
        int a=0;
        int b=1;
        int c=0;
        if(n<=1){
            return 1;
        }else{
            for(int i=0;i<n;i++){
                c=(a+b)%1000000007;
                a=b;
                b=c;
            }
        }
        return c;
    }
}
