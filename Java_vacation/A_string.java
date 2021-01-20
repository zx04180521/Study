package Java_vacation;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
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

    }
    //字符串替代
    public static void stringReplace() {
        String str1="Hello World";
        String str2=str1.replace("Hello","hello");
        System.out.println("替换前："+str1);
        System.out.println("替换后："+str2);
    }


    //字符串拆分
    public static void stringSplit() {
        String str="Hello world 123 ";
        String[] newstr1=str.split(" ");
        String[] newstr2=str.split(" ",2);
        System.out.println(Arrays.toString(newstr1));
        System.out.println(Arrays.toString(newstr2));
    }


    //字符串比较
    public static void stringEquals() {
        //==操作比较地址
        String str1="Hello";
        String str2="Hello";
        System.out.println(str1==str2);//true
        String str3=new String("Hello");
        String str4=new String("Hello");
        System.out.println(str3==str4);//false

       // intern方法
        String str5="hello".intern();
        String str6="hello";
        System.out.println(str5==str6);//true

        //比较字符串使用equals()方法
        String str7="hello";
        System.out.println("hello".equals(str7));
       // 不建议写成以下的形式
        System.out.println(str7.equals("hello"));
       // 如果字符串为空会报错
        String str8=null;
        System.out.println(str8.equals("hello"));//报错
        System.out.println("hello".equals(str8));//false
    }


    //字符串创建
    public static void stringCreate() {
       // 方式一
         String str1="Hello world";
      //  方式二
          String str2=new String("Hello world");
       // 方式三
         char[] array={'a','b','c'};
         String str3=new String(array);
    }


    //字节与字符串之间的转化
    public static void byteStringTransform() {
                String str="hello";
        byte[] data =str.getBytes();
        System.out.print("字符串str转化的字节数组data[]为：");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
        String newstr=new String(data);
        System.out.print("字节数组data[]转化的字符串newstr为：");
        System.out.println(newstr);
    }

    //字符与字符串之间的转化
    public static void charStringTransform() {
        String str="helloworld";
        char[] data=str.toCharArray();
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");

        }
        System.out.println();
        String str2=new String(data);
        String str3=new String(data,0,5);
        System.out.println(str2);
        System.out.println(str3);
    }


    //字符串比较
    public static void Stringcompare() {
        String str1="A";
        String str2="a";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }


    //字符串查找
    public static void Stringsearch() {
        String str1 = "hello world world world";
        String str2 = "world";
        System.out.println(str1.charAt(1));//e
        System.out.println(str1.contains(str2));//true
        int result = str1.indexOf(str2);
        System.out.println(result);//6
        System.out.println(str1.indexOf(str2, result + 1));//12
        System.out.println(str1.startsWith(str2));//false
        System.out.println(str1.endsWith(str2));//true
    }
}
