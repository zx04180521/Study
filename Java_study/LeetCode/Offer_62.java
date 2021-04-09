package LeetCode;
//圆圈中最后剩下的数字
public class Offer_62 {
    public static void main(String[] args) {

    }
    public int lastRemaining(int n, int m) {
        return last(n,m);
    }
    public static int last(int n,int m){
        if(n==1){
            return 0;
        }
        int temp=last(n-1,m);
        return (temp+m)%n;
    }
}
