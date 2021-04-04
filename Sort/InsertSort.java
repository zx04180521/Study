package Sort;
/*插入排序*/
import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] ary={3,5,6,8,1,0};
        insert(ary);
        System.out.println(Arrays.toString(ary));
    }
    public static void insert(int[] ary){
        int bound=1;
        for(;bound<ary.length;bound++){
            int temp=ary[bound];//未排序的第一个元素
            int cur=bound-1;//已排序的最后一个元素
            for(;cur>=0;cur--){
                if(ary[cur]>temp){
                    ary[cur+1]=ary[cur];//将ary[cur]向后移动一位
                }else{
                    //当前ary[cur]<temp，找到了该在的位置
                    break;
                }
            }
            ary[cur+1]=temp;//将temp放在cur的下一位
        }
    }
}
