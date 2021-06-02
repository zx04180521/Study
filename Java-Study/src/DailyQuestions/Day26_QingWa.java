package DailyQuestions;
/*变态青蛙跳台阶*/
public class Day26_QingWa {
    public int jumpFloorII(int target) {
        int a = 1;
        for (int i = 1; i < target; i++) {
            a *= 2;
        }
        return a;
    }
}

