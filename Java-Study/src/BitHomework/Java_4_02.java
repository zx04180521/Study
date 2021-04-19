package BitHomework;

import java.util.Scanner;

public class Java_4_02 {
    public static void main(String[] args) {
        //输出整数每一位
//        Scanner scanner=new Scanner(System.in);
//        int num=scanner.nextInt();
//        outPut(num);

        //判断一个数是否是素数
//        System.out.print("请输入一个整数：");
//        Scanner scanner=new Scanner(System.in);
//        int num=scanner.nextInt();
//       if(isPrimeNum(num)){
//           System.out.println(num+"是一个素数");
//       }
//       else{
//           System.out.println(num+"不是一个素数");
//       }

        //输出1-100之间所有素数
//        for(int i=1;i<101;i++){
//            if(i==1) {
//                System.out.println("1不是素数。也不是合数");
//            }else if(isPrimeNum(i))
//                System.out.printf("%d是素数\n",i);
//        }


        //输出1000-2000年之间闰年
        //普通闰年：公历年份是4的倍数的，且不是100的倍数，为普通闰年（如2004年、2020年就是闰年）。
        // 世纪闰年：公历年份是整百数的，必须是400的倍数才是世纪闰年（如1900年不是世纪闰年，2000年是世纪闰年）。

//        for(int year=1000;year<=2000;year++){
//            if(isLeapYear(year)){
//                System.out.println(year+"是闰年");
//            }else{
//                System.out.println(year+"不是闰年");
//            }
//        }

        //输出乘法口诀表
//        for(int i=1;i<10;i++){
//            printline(i);
//            System.out.println();
//        }
    }


    //乘法口诀表
    private static void printline(int i) {
        for (int l = 1; l <= i; l++) {
            System.out.printf("%d*%d=%-4d", l, i, i * l);
        }
    }

    //输出整数每一位
    private static void outPut(int num) {
        int[] a=new int[10];
        int i=0;
        int count=0;
        String s="";
        while(num!=0){
            a[i]=num%10;
            num=num/10;
            i=i+1;
            count++;
        }
        for(int j=count-1;j>=0;j--){
            s=s+a[j]+" ";
        }
        System.out.println(s);

    }

    //素数
    private static boolean isPrimeNum(int num) {
        for (int i = num - 1; i > 1; i--) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    //闰年
    private static boolean isLeapYear(int y) {
        if (y % 100 == 0) {
            if (y % 400 == 0) {
                return true;
            } else {
                return false;
            }

        } else {
            if (y % 4 == 0) {
                return true;
            }
            return false;
        }
    }


}
