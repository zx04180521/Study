package NiuKe;
/*斐波那契数列*/
public class NC65 {
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
}
