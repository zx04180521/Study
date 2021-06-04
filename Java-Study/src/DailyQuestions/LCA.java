package DailyQuestions;
/*最近公共祖先*/
public class LCA {
    public static void main(String[] args) {
    }
    public int getLCA(int a, int b) {
        // write code here
        while (a != b) {
            if (a > b) {
                a /= 2;
            } else {
                b /= 2;
            }
        }
        return b;
    }
}
