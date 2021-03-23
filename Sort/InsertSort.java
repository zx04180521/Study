package Sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] ary={3,5,6,8,1,0};
        insertSort(ary);
        System.out.println(Arrays.toString(ary));
    }
    public static int[] insertSort(int[] ary){
        int i=1;
        for(;i<ary.length;i++){
            int temp=ary[i];
            int cur=i-1;
            for(;cur>=0;cur--){
                if(ary[cur]>temp){
                    ary[cur+1]=ary[cur];
                }else{
                    break;
                }
            }
            ary[cur+1]=temp;
        }
        return ary;
    }
}
