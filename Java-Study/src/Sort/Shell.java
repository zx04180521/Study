package Sort;

import java.util.Arrays;

public class Shell {
    public static void main(String[] args) {
        int[] ary={9,5,2,7,3};
        shell(ary);
        System.out.println(Arrays.toString(ary));
    }
    public static void shell(int[] arr){
        int length=arr.length;
        int gap=length/2;
        while(gap>=1){
            _shell(arr,gap);
            gap=gap/2;
        }
    }
    public static void _shell(int[] arr, int gap){
        int bound=gap;
        for(;bound<arr.length;bound++){
            int temp=arr[bound];
            int cur=bound-gap;
            for(;cur>=0;cur-=gap){
                if(arr[cur]>temp){
                    arr[cur+gap]=arr[cur];
                }else{
                    break;
                }
            }
            arr[gap+cur]=temp;
        }
    }

}
