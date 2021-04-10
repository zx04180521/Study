package Dp;

public class Fibonacci {
    public static void main(String[] args) {

    }
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n<=2){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public int Fibonacci_2(int n) {
        if(n==0){
            return 0;
        }
        if(n<=2){
            return 1;
        }
        int a=1;
        int b=1;
        int c=0;
        for(int i=0;i<n-2;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }

    public int Fibonacci_3(int n) {
        int[] ary=new int[40];
        ary[0]=0;
        ary[1]=1;
        ary[2]=1;
        for(int i=3;i<=n;i++){
            ary[i]=ary[i-1]+ary[i-2];
        }
        return ary[n];
    }
}
