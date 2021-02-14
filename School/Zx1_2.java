package zhangxin;
public class  Zx1_2 {
	public static void main(String args[]){
		N b1 = new N();
		N b2 = new N();
		b1.setN(2);
		b2.setN(2);
		int s1 = b1.getSum();
		int s2 = b2.getSum();
		System.out.println(s1+s2);
	}

}


 class N{
    int n;
    static int sum=0;
    void setN(int n){
    	this.n =n;
    }
    int getSum(){
   	for(int i=1; i<=n;i++){
    		sum =sum+i;
    	}
    return sum;
    }
}


