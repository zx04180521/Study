package DailyQuestions;

public class BinInsert {
    public static void main(String[] args) {
        System.out.println(binInsert(28679,205,3,11));
    }
    public static int binInsert(int n, int m, int j, int i) {
        // write code here
        String nB=dToB(n);
        String mB=dToB(m);
        int length=mB.length();
        StringBuffer strBuf=new StringBuffer();
        String str1=nB.substring(0,nB.length()-(j+length));
        String str2=nB.substring(nB.length()-j,nB.length());
        strBuf.append(str1);
        strBuf.append(mB);
        strBuf.append(str2);
        int res=bToD(strBuf.toString());
        return res;
    }
    //二进制转十进制
    public static int bToD(String str){
        int num=0;
        int p=0;
        for(int i=str.length()-1;i>=0;i--){
            int temp=str.charAt(i)-'0';
            num+=temp*Math.pow(2,p);
            p++;
        }
        return num;
    }
    //十进制转二进制
    public static String dToB(int num){
        StringBuffer strBuf=new StringBuffer();
        while(num>0){
            strBuf.append(num%2);
            num/=2;
        }

        return strBuf.reverse().toString();
    }
}
