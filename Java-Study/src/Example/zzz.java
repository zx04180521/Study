package Example;

public class zzz {
    public static void main(String[] args) {
        String str="abbab";
        boolean[][] a=isP(str);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean[][] isP(String s){
        char[] c=s.toCharArray();
        int length=s.length();
        boolean[][] res=new boolean[length][length];
        for(int i=0;i<length;i++){
            res[i][i]=true;
        }
        for(int i=1;i<length;i++){
            for(int j=i-1;j>=0;j--){
                if(c[i]!=c[j]){
                    res[j][i]=false;
                }else{
                    if(res[j+1][i-1]||i-j<3){
                        res[j][i]=true;
                    }else{
                        res[j][i]=false;
                    }
                }
            }
        }
        return res;
    }
}
