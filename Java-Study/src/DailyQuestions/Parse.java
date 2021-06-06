package DailyQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*参数解析*/

/*
xcopy /s c:\ d:\，
各个参数如下：
参数1：命令字xcopy
参数2：字符串/s
参数3：字符串c:\
参数4: 字符串d:\
请编写一个参数解析程序，实现将命令行各个参数解析出来。

1.参数分隔符为空格
2.对于用""包含起来的参数，如果中间有空格，不能解析为多个参数。
  比如在命令行输入xcopy /s "C:\program files" "d:\"时，
  参数仍然是4个，第3个参数应该是字符串C:\program files，而不是C:\program，
  注意输出参数时，需要将""去掉，引号不存在嵌套情况。
3.参数不定长
4.输入由用例保证，不会出现不符合要求的输入
*/
public class Parse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        split(str);
    }

    //方法一
    public static void split1(String str) {
        int count = 0;
        //获取参数的个数
        for (int i = 0; i < str.length(); i++) {
            //遇到双引号需要跳过里面的内容
            if (str.charAt(i) == '"') {
                i++;
                while (str.charAt(i) != '"') {
                    i++;
                }
            }
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count + 1);
        int flag = 1;//flag=1表示在双引号外面，flag=0表示在双引号里面
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '"') {
                flag ^= 1;
            }
            //1.在双引号外面碰见空格，则换行
            if (str.charAt(i) == ' ' && flag == 1) {
                System.out.println();
            }
            //2.在双引号里面碰见空格则打印空格
            if (str.charAt(i) == ' ' && flag == 0) {
                System.out.print(str.charAt(i));
            }
            //3.不能打印双引号，也不能打印空格，因为空格的所有情况已经包含在了前两种情况
            //  其余的正常打印即可
            if (str.charAt(i) != '"' && str.charAt(i) != ' ') {
                System.out.print(str.charAt(i));
            }
        }
    }

    //方法二
    public static void split(String str) {
        int start = 0;
        int end = 0;
        int length = str.length();
        Queue<String> queue = new LinkedList<>();//储存解析后的字符串
        while (end < length) {
            //判断字符串最开始是不是双引号
            if (str.charAt(end) == '"') {
                end = end + 1;//从双引号的下一个字符开始
                start = end;
                while (end < length && str.charAt(end) != '"') {
                    //将end遍历到下一个字符串
                    end++;
                }
                queue.offer(str.substring(start, end));//将双引号中的字符串插入队列
                end++;//end指向双引号的下一个位置
                continue;
            }
            //判断字符串中间的双引号，因为每次插入之后，end总指向空格位置
            //所以需要判断end+1位置是不是双引号
            if (str.charAt(end + 1) == '"') {
                end = end + 2;//从双引号的下一个字符开始
                start = end;
                while (end < length && str.charAt(end) != '"') {
                    //将end遍历到下一个字符串
                    end++;
                }
                queue.offer(str.substring(start, end));//将双引号中的字符串插入队列
                end++;//end指向双引号的下一个位置
                continue;
            }
            //将end指向空格之后的字符串，也就是每个解析后字符串开始的位置
            while (end < length && str.charAt(end) == ' ') {
                end++;
            }
            start = end;
            //将end指向解析后字符串结束的位置，也就是空格
            while (end < length && str.charAt(end) != ' ') {
                end++;
            }
            queue.offer(str.substring(start, end));//将两个空格之间的字符串插入队列
        }
        //以下是需要打印的内容
        int size = queue.size();
        System.out.println(size);
        while (!queue.isEmpty()) {
            String s = queue.peek();
            queue.poll();
            System.out.println(s);
        }
    }

}
