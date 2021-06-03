package DailyQuestions;

import java.util.ArrayList;
import java.util.Scanner;

/*【删数】有一个数组a[N]顺序存放0~N-1，
要求每隔两个数删掉一个数，到末尾时循环至开头继续进行，
求最后一个被删掉的数的原始下标位置。以8个数(N=7)为
例:
｛0，1，2，3，4，5，6，7｝，
0->1->2(删除)->3->4->5(删除)->6->7->0(删除),
如此循环直到最后一个数被删除。*/
public class DeleteNums {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            delete(num);
        }
    }
    public static void delete(int num){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<num;i++){
            list.add(i);//将元素插入顺序表
        }
        int pos=0;//记录每次的开始位置
        while(list.size()>1){
            int temp=(pos+2)%list.size();//获取要删除元素的下标
            list.remove(temp);
            pos=temp;//更新pos位置
        }
        System.out.println(list.get(0));
    }
}
