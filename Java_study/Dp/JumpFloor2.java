package Dp;
/*变态青蛙跳台阶*/
public class JumpFloor2 {
    public static void main(String[] args) {

    }
    public int jumpFloorII(int target) {
        if(target<=1){
            return 1;
        }
        int a=1;
        int b=0;
        for(int i=0;i<target-1;i++){
            b=2*a;
            a=b;
        }
        return b;
    }
}
