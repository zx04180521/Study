package Java_String;

import java.util.Arrays;

public class A_string {
    public static void main(String[] args) {
//        stringCreate();//字符串创建
//        stringEquals();//字符串比较
//        byteStringTransform();//字节与字符串之间的转化
//        charStringTransform();//字符串与字符数组之间的相互转化
//        Stringcompare();//字符串比较
//        Stringsearch();//字符串查找
//        stringSplit();//字符串拆分
//        stringReplace();//字符串替代
//        stringCutOut();//字符串截取
//        other();
//        stringBuffer();

//        int aa=1;
//        double bb=2;
//        char[] c={'u'};
//
//        String ss=c.toString();
//        String ss2=aa.toString();
//        String ss3=String.valueOf(aa);
//

        int[] a1 = {1, 2};
        char[] a = {'q'};
        char[] b={'q'};
        System.out.println(a1);//[I@1b6d3586
        System.out.println(a);//q
        System.out.println(String.valueOf(a));//q
        String str1=a.toString();
        String str2=b.toString();
        System.out.println(str1);//[C@4554617c

        System.out.println(str1.equals(str2));//false

        System.out.println(String.valueOf(a).equals(String.valueOf(b)));//true
        System.out.println(Arrays.toString(b).equals(Arrays.toString(a)) );//true
        System.out.println(new String(a).equals(new String(b)));//true

        String[] a2={"aa","aa"};
        System.out.println(a2);//[Ljava.lang.String;@1540e19d
    }//

    public static void stringBuffer() {
//        StringBuffer sb=new StringBuffer();
//        sb.append("Hello");
//        sb.append(" ");
//        sb.append("World");
//        System.out.println(sb);
        StringBuffer sb = new StringBuffer("Hello world");
        System.out.println(sb);
        System.out.println(sb.reverse());//字符串反转
        System.out.println(sb.reverse());//字符串反转
        System.out.println(sb.delete(0, 5));//删除字符串某一部分
        System.out.println(sb.insert(0, "hello"));//在字符串某一部分插入一部分内容
    }

    private static void other() {
        String str = " Hello World ";
        //去除字符串str开头和结尾的空白字符（空格、换行、制表符等等）
        String str1 = str.trim();
        System.out.println("[" + str1 + "]");

        String str2 = str.toLowerCase();//字符串转小写
        String str3 = str.toUpperCase();//字符串转大写
        System.out.println(str2);
        System.out.println(str3);

        int length = str.length();//返回字符串长度
        System.out.println(length);

        System.out.println(str.isEmpty());//判断字符串是否为空


    }

    private static void stringCutOut() {
        String str = "Hello world";
        System.out.println(str.substring(6));
        System.out.println(str.substring(0, 5));
    }

    //字符串替代
    public static void stringReplace() {
        String str1 = "Hello Hello World";
        String str2 = str1.replaceAll("Hello", "hello");
        System.out.println("替换前：" + str1);
        System.out.println("替换所有后：" + str2);
        String str3 = str1.replaceFirst("Hello", "hello");
        System.out.println("替换部分后：" + str3);

    }


    //字符串拆分
    public static void stringSplit() {
        String str = "Hello world hello ";
        String[] newstr1 = str.split(" ");
        String[] newstr2 = str.split(" ", 2);
        System.out.println(Arrays.toString(newstr1));
        System.out.println(Arrays.toString(newstr2));

        //字符串多次拆分
        String str2 = "name=zhangsan&age=18";
        String[] result = str2.split("&");
        for (int i = 0; i < result.length; i++) {
            String[] temp = result[i].split("=");
            System.out.println(temp[0] + "=" + temp[1]);
        }

    }


    //字符串比较
    public static void stringEquals() {
        //==操作比较地址
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);//true
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println(str3 == str4);//false

        // intern方法
        String str5 = "hello".intern();
        String str6 = "hello";
        System.out.println(str5 == str6);//true

        //比较字符串使用equals()方法
        String str7 = "hello";
        System.out.println("hello".equals(str7));
        // 不建议写成以下的形式
        System.out.println(str7.equals("hello"));
        // 如果字符串为空会报错
        String str8 = null;
        System.out.println(str8.equals("hello"));//报错
        System.out.println("hello".equals(str8));//false
    }


    //字符串创建
    public static void stringCreate() {
        // 方式一
        String str1 = "Hello world";
        //  方式二
        String str2 = new String("Hello world");
        // 方式三
        char[] array = {'a', 'b', 'c'};
        String str3 = new String(array);
    }


    //字节与字符串之间的转化
    public static void byteStringTransform() {
        String str = "01234";
        byte[] data = str.getBytes();
        System.out.print("字符串str转化的字节数组data[]为：");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        String newstr = new String(data);
        System.out.print("字节数组data[]转化的字符串newstr为：");
        System.out.println(newstr);
    }

    //字符与字符串之间的转化
    public static void charStringTransform() {
        String str = "helloworld";
        char[] data = str.toCharArray();
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");

        }
        System.out.println();
        String str2 = new String(data);
        String str3 = new String(data, 0, 5);
        System.out.println(str2);
        System.out.println(str3);
    }


    //字符串比较
    public static void Stringcompare() {
        String str1 = "A";
        String str2 = "Aaa";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }


    //字符串查找
    public static void Stringsearch() {
        String str1 = "hello world world world";
        String str2 = "world";
        //返回字符串某一位置的字符
        System.out.println(str1.charAt(1));//e
        //判断str1是否包含str2
        System.out.println(str1.contains(str2));//true

        //查找str1中str2的位置，返回str2开始的位置，没有找到返回-1
        int result = str1.indexOf(str2);
        System.out.println(result);//6
        //从result + 1位置开始查找str2
        int result2 = str1.indexOf(str2, result + 1);
        System.out.println(result2);//12
        // 从后向前开始查找str2
        int result3 = str1.lastIndexOf(str2);
        System.out.println(result3);//18

        //判断str1是否以str2开头/结尾
        System.out.println(str1.startsWith(str2));//false
        System.out.println(str1.endsWith(str2));//true
    }
}
