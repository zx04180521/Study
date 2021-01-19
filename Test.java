import java.util.Random;

import static java.util.Arrays.sort;

public class Test {

    public static void main(String[] args) {


//        int a=new Integer(2);
//        System.out.println(a);

        //打印当前年龄的人是少年（低于18），青年（19-28），中年（29-55），老年（65以上）
        Random ra=new Random();
        int age=ra.nextInt(100)+1;
        System.out.println(age);
        if(age<=18){
            System.out.println("少年");
        }
        else if(age<=28){
            System.out.println("青年");
        }
        else if(age<=55){
            System.out.println("中年");
        }
        else{
            System.out.println("老年");
        }


        //判断一个数是否是素数
//        Random ra=new Random();
//        int a=ra.nextInt(100);
//        System.out.println(a);
//        for(int i=2;i<a;i++){
//            if(a%i==0){
//                System.out.println("是素数");
//                return ;
//            }
//        }
//        System.out.println("不是素数");


//        //输出1-100之间的所有素数
//        int j;
//     for(int i=1;i<=100;i++){
//         for(j=2;j<=i;j++){
//             if(i%j==0){
//                 break;
//             }
//         }
//         if(i==j){
//             System.out.println(i);
//         }
//     }

//for-each遍历数组


//        int[] arr = {1, 2, 3, 4};
//        System.out.println(Arrays.toString(arr));//转字符串
//        int[] newarr= Arrays.copyOf(arr,arr.length);
//        newarr[0]=100;
//        System.out.println(Arrays.toString(newarr));
//         printArray(arr);


       /* int[] arr = {9, 5, 2, 7};
        //bubbleSort(arr);
        //sort(arr);
        bubbleSort2(arr);
        System.out.println(Arrays.toString(arr));*/


//  Aa b=new Aa();
//        b.a();

//调用无参构造方法
//        Cat cat = new Cat();
//        System.out.println(cat.name);

//调用含参构造方法
//        Scanner scanner=new Scanner(System.in);
//        String name=scanner.next();
//        Cat cat=new Cat(name);
//        System.out.println(cat.name);


//        int a=10;
//        int b=20;
//        System.out.println("a="+a+",b="+b);

// 查看整型数据范围
        /*System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        int num = 10;
        System.out.println(num);
        long num1 = 10L;//定义一个长整型变量，初始值也可以写作10l(小写的L，不是数字1)
        System.out.println(num);

        float a=0.1f;
        System.out.println(a);*/

//        boolean value1=true;
//        boolean value2=true;
//        System.out.println(value1);
//        String name="yaoyao";
//        System.out.println(name);

//        String a="hello\t";
//        String b="world";
//        String c=a+b;
//        System.out.println(c);


 /*       int a = 10;
        System.out.println(a++);
        System.out.println(a);
        int b=10;
        System.out.println(++b);
        System.out.println(b);*/


/*        int a=10;
        int b=20;
        int c=30;
        System.out.println(a < b || b < c);*/

/*        int a=0x10;
        System.out.printf("%x\n",a>>1);
        int b=0xffff0000;
        System.out.printf("%x\n",b>>1);
        System.out.printf("%x\n",b>>>1);*/

//        int a=10;
//        int b=20;
//        int max=a>b?a:b;
//        System.out.println(max);

//        int num=10;
////方法1
//        String str1=num+"";
////方法2
//        String str2=String.valueOf(num);
//
//        String str="100";
//        int num1=Integer.parseInt(str);
//        System.out.println(num1);



     /*   int a=10;
        int b=++a;
        System.out.println(b);
        int c=a++;
        System.out.println(c);*/


        //传入一个字符串数字，返回一个整型数字
//        int num = parseInt("12345");
//        System.out.println(num);

    }


    //==========================================================================================================
    //————————————————————————————————————————————————以下是方法实现———————————————————————————————————————————————————
    //=======================================================================================================
    public static int parseInt(String str) {
        //声明一个字符数组
        char[] chars = new char[str.length()];
        //声明一个整型数组（用来装字符转换成整型数字结果）
        int[] ints = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            //分解字符串，装入字符数组
            chars[i] = str.charAt(i);
            //把字符数组里的字符通过-'0'转换成整型数字，装入整型数组
            ints[i] = chars[i] - '0';
        }

        //把整型数组转换成整型
        int num = 0;
        for (int i = 0; i < ints.length; i++) {
            num = num * 10 + ints[i];
        }

        return num;
    }








    //冒泡排序(汤老师版本)
    private static void bubbleSort(int[] arr) {
        for (int bound = 0; bound < arr.length - 1; bound++) {
            for (int cur = arr.length - 1; cur > bound; cur--) {
                if (arr[cur - 1] < arr[cur]) {
                    int temp = arr[cur - 1];
                    arr[cur - 1] = arr[cur];
                    arr[cur] = temp;
                }

            }
        }

    }

    //自己版本
    private static void bubbleSort2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    //java中简便的遍历
    public static void printArray(int[] a) {
        for (int x : a) {
            System.out.println(x);
        }
    }


}

