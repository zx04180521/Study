package DailyQuestions;

import java.util.Scanner;

public class Drink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            int count = 0;
            while (num >= 3) {
                int temp = num / 3;//可以得到的饮料数
                num = num % 3 + temp;//喝完饮料后手里的空瓶数
                count += temp;//已获得的饮料数
            }
            if (num != 2) {
                //如果最后剩下不是两个空瓶，就打印count
                System.out.println(count);
            } else {
                //如果最后剩下是两个空瓶，就可以在获得一瓶饮料就打印count+1，
                System.out.println(count + 1);
            }
        }
    }
}
