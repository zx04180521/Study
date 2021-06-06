package DailyQuestions;

import java.util.Scanner;

//小易的升级之路
public class Upgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int count = sc.nextInt();//野怪的数量
            int curAbility = sc.nextInt();//当前的能力值
            int[] ary = new int[count];
            for (int i = 0; i < count; i++) {
                ary[i] = sc.nextInt();
            }
            for (int i = 0; i < count; i++) {
                if (ary[i] <= curAbility) {
                    //野怪防御力小于小易当前能力值
                    curAbility += ary[i];
                } else {
                    //野怪防御力大于小易当前能力值
                    curAbility += gcd(ary[i], curAbility);
                }
            }
            System.out.println(curAbility);
        }
    }

    //求最大公因数
    public static int gcd(int a, int b) {
        int temp = a < b ? a : b;
        for (int i = temp; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

}
