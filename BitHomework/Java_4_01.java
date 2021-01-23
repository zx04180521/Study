package BitHomework;

import java.util.Random;
import java.util.Scanner;

public class Java_4_01 {
    public static void main(String[] args) {



        //求两数最大公约数
//        for(int i=10;i<=100;i++) {
//            for (int j = 10; j <= 100; j++) {
//               int z= gcd(i,j);
//               if(z!=1&&z!=2)
//                System.out.printf("%d和%d的最大公约数是%d\n", i, j, gcd(i,j));
//            }
//        }


//求1/1-1/2+1/3-1/4+1/5-1/6···+1/99-1/n(n是偶数)
        System.out.println("n=100,sum="+cal1(100));//方法一
        cal(100);//方法二


//        Random random=new Random();
//        System.out.println(random.nextInt(100));


        //1-100中9出现的次数
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入要查询次数的数字：");
//        int i=scanner.nextInt();
//        System.out.println("1-100中"+i+"出现了"+frequency(i)+"次");


        //猜数字游戏
//        Scanner scanner=new Scanner(System.in);
//         PlayGame(scanner);


        //模拟输入密码
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请设置密码:");
//        String password=scanner.nextLine();
//        input(scanner,password);

    }

    //------------------------------------------------------------------------------------------------
    //---------------------------------------方法实现---------------------------------------------------
    //------------------------------------------------------------------------------------------------




    //输入密码
    public static boolean input(Scanner scanner, String password) {
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入密码：");
            String pw = scanner.nextLine();
            if (pw.equals(password)) {
                System.out.println("登陆成功");
                return true;
            }
            System.out.printf("剩余%d次机会\n", 2 - i);

        }
        return false;
    }


    //猜数字
    public static void PlayGame(Scanner scanner) {
        Random random = new Random();
        int rnum = random.nextInt(100);
        while (true) {
            System.out.printf("请输入您要猜测的数字：");
            int num = scanner.nextInt();
            if (num < rnum) {
                System.out.println("猜小了；");
                continue;
            }
            if (num > rnum) {
                System.out.println("猜大了；");
                continue;
            }
            if (num == rnum) {
                System.out.println("猜对了；");
                break;
            }

        }

    }


    //数字出现次数
    public static int frequency(int i) {
        int count = 0;
//        for (int j = 1; j <= 100; j++) {
//
//            if (j % 10 == i) count++;
//            if (j / 10 != 0) {
//                int m1 = j / 10;
//                if (m1 % 10 == i) count++;
//                if (m1 / 10 != 0) {
//                    int m2 = m1 / 10;
//                    if (m2 % 10 == i) count++;
//                }
//            }
//        }
        for (int j = 1; j <= 100; j++) {
            int m=j;
            while (m!= 0) {
                if (m%10 == i){count++;}
                m=m/10;
            }

        }
        return count;
    }

    //求1/1-1/2+1/3-1/4+1/5-1/6···+1/99-1/n(n是偶数)
    private static double cal1(int n) {
        double sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += calTiem(i);
        }
        return sum;
    }

    private static double calTiem(int n) {
        return 1.0 / (n - 1) - 1.0 / n;
    }


    public static void cal(int n) {
        double sum = 0;
        for (int i = 2; i <= n; i += 2) {
            double b = 1.0 / (i - 1) - 1.0 / i;
            sum = sum + b;

        }
        System.out.println(sum);
    }



    //最大公约数
    private static int gcd(int i, int j) {

        int min = Integer.min(i, j);
        for (int k = min; k > 0; k--) {
            if (i % k == 0 && j % k == 0) {
                return k;
            }
        }
        return 1;
    }




}
