package DailyQuestions;

import java.util.Scanner;

/*【不要二】二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1。
每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。
对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为:
( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根
小易想知道最多可以放多少块蛋糕在网格盒子里*/
public class NoTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int list = sc.nextInt();
        int line = sc.nextInt();
        if (line == 0) {
            System.out.println(0);
            return;
        }
        int[][] arr = new int[line][list];
        int res = maxNums(arr);
        System.out.println(res);
    }

    public static int maxNums(int[][] arr) {
        int count = 0;//记录可放蛋糕的位置个数
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    count++;
                    if (i + 2 < arr.length) {
                        //将arr[i + 2][j]位置赋值为1，表示不可以放蛋糕
                        arr[i + 2][j] = 1;
                    }
                    if (j + 2 < arr[0].length) {
                        //将arr[i][j+2]位置赋值为1，表示不可以放蛋糕
                        arr[i][j + 2] = 1;
                    }
                }
            }
        }
        return count;
    }

}
