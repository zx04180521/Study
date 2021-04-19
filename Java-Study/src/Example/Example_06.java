package Example;

import java.util.Arrays;

public class Example_06 {
    public static void main(String[] args) {
        int[] a={9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(a)));
    }
    public static int[] plusOne(int[] digits){
        String s="";
        for(int i:digits){
            s+=i;
        }
        int  num=Integer.valueOf(s);
        num++;
        String str=num+"";
        int[] q=new int[str.length()];
        for(int i=0;i<str.length();i++){
            String str2=new String(String.valueOf(str.charAt(i)));
            q[i]=Integer.parseInt(str2);

        }
        return q;
    }
}
