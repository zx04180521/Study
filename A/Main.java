package A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        int cur = Integer.MAX_VALUE;
        if (num <= 3) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
            int acur=Math.abs(num-c);
            if(acur==0){
                System.out.println(acur);
                return;
            }else{
                cur=Math.min(cur,acur);
            }
        }
        System.out.println(cur);
    }
}
