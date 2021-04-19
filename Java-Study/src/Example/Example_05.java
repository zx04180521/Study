package Example;


import java.util.Arrays;

public class Example_05 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        t(a);
        System.out.println(Arrays.toString(a));
    }
    public static void t (int[] a){
        int[] b = {2, 3, 4};
        a = b;

    }
}
