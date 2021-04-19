package LeetCode;
/*左旋转字符串*/
public class Offer_58_2 {
    public static void main(String[] args) {

    }

    public String reverseLeftWords(String s, int n) {
        return s.substring(n,s.length())+s.substring(0,n);
    }

    //方法二
//    public String reverseLeftWords(String s, int k) {
//        char[] ary=new char[s.length()];
//        int index=0;
//        for(char c:s.toCharArray()){
//            ary[index++]=c;
//        }
//        for(int i=0;i<k;i++){
//            char temp=ary[0];
//            for(int j=0;j<ary.length-1;j++){
//
//                ary[j]=ary[j+1];
//            }
//            ary[ary.length-1]=temp;
//        }
//        StringBuffer strBu=new StringBuffer();
//        for(char c:ary){
//            strBu.append(c);
//        }
//        return strBu.toString();
//    }
}
