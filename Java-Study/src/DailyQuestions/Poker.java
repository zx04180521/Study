package DailyQuestions;

import java.util.*;

public class Poker {
    public static String poker = "345678910JQKA2jokerJOKER";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.contains("joker JOKER")) {
            //如果有其中一手牌是大小王，则世界输出joker JOKER
            System.out.println("joker JOKER");
            return;
        }
        String[] str = s.split("-");//以-分割,str中就保存的是两手牌
        String[] left = str[0].split(" ");//以空格分割str[0]，left中就保存的左手的排
        String[] right = str[1].split(" ");//以空格分割str[1]，right中就保存的左手的排
        if (left.length == right.length) {
            //如果长度相等，则判断第一个字符在poker中的位置，谁在后，谁的点数就大
            String temp = poker.indexOf(left[0]) > poker.indexOf(right[0]) ? str[0] : str[1];
            System.out.println(temp);
        } else if (left.length == 4) {
            //左手排是4张，则是炸弹，打印左手牌
            System.out.println(str[1]);
        } else if (left.length == 4) {
            //右手排是4张，则是炸弹，打印右手牌
            System.out.println(str[0]);
        } else {
            System.out.println("ERROR");
        }
    }
}