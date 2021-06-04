package DailyQuestions;
/*小易来到了一条石板路前，每块石板上从1挨着编号为：1、2、3.......
这条石板路要根据特殊的规则才能前进：对于小易当前所在的编号为K的石板，
小易单次只能往前跳K的一个约数(不含1和K)步，即跳到K+X(X为K的一个非1和本身的约数)的位置。
小易当前处在编号为N的石板，他想跳到编号恰好为M的石板去，小易想知道最少需要跳跃几次可以到达。
例如：
N = 4，M = 24：
4->6->8->12->18->24
于是小易最少需要跳跃5次，就可以从4号石板跳到24号石板*/
import java.util.ArrayList;
import java.util.Scanner;

public class JumpSlate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] res=new int[M+1];
        for(int i=N+1;i<=M;i++){
            //初始化大小
            res[i]=Integer.MAX_VALUE;
        }
        for(int cur=N;cur<M;cur++){
            //如果当前位置的值等于初始值，表示不可以到达此位置
            if(res[cur]==Integer.MAX_VALUE){
                continue;
            }
            ArrayList<Integer> list=fac(cur);//存储cur的所有因子
            for(int j=0;j<list.size();j++){
                int temp=cur+list.get(j);//当前可以到达的位置
                int count=res[cur]+1;//需要的步数
                if(temp<=M&&count<res[temp]){
                    res[temp]=count;
                }
            }
        }
        int s=res[M];
        if(s==Integer.MAX_VALUE){
            System.out.println(-1);
            return;
        }
        System.out.println(s);
    }
    //查找因子
    public static ArrayList<Integer> fac(int n){
        ArrayList list=new ArrayList();
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                list.add(i);
                if(i!=n/i)list.add(n/i);
            }
        }
        return list;
    }
}
