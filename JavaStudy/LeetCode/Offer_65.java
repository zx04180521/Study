package LeetCode;
/*不用加减乘除做加法*/
public class Offer_65 {
    public static void main(String[] args) {

    }
    public int add(int a, int b) {
        if(b==0){
            return a^b;
        }
        return add(a^b,(a&b)<<1);
    }
    //方法二
//    public int add(int a, int b) {
//        while(b!=0){
//            int temp=a^b;
//            b=(a&b)<<1;
//            a=temp;
//        }
//        return a;
//    }
}
