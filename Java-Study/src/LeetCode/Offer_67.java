package LeetCode;
/*
* 把字符串转化为整数
* */
public class Offer_67 {
    public static void main(String[] args) {
        String s="321csda";
        System.out.println(strToInt(s));
    }
    public static int strToInt(String str) {
        char[] c=str.trim().toCharArray();
        if(c.length==0)return 0;
        int newInt = 0;
        int tmp;
        int sign=1;
        int i=1;
        if(c[0]=='-'){sign=-1;}
        else if(c[0]!='+'){i--;}
        for(;i<c.length;i++){
            if(c[i]>'9'||c[i]<'0'){break;}
            tmp=10*newInt+(c[i]-'0');
            if(tmp/10!=newInt){return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;}
            newInt=tmp;
        }

        return newInt*sign;
    }
}
