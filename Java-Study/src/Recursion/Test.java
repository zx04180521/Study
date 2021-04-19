package Recursion;

public class Test {
    public static void main(String[] args) {
        //求阶乘
        int result = factorial(5);
        System.out.println("阶乘："+result);

        //0到n项和
        int num=sum(5);
        System.out.println("0到n项和："+num);

        //斐波那契数列第n项
        int cur=fib(3);
        System.out.println("斐波那契数列第n项："+cur);
    }
    //斐波那契数列第n项
    private static int fib(int n) {
        if(n<=2){
            return 1;
        }
        return fib(n-2)+fib(n-1);
    }



    //求阶乘
    public static int factorial(int n) {
        if (n < 2) {
            return n;
        }
        return factorial(n - 1) * n;
    }

    //求0到n项和
    public  static int sum(int n){
        if(n<2){
            return n;
        }
        return sum(n-1)+n;
    }

}
