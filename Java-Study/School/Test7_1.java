package seven;
/**
 * ��дһ���������ĳ��ĳ�µ�����ҳ��ͨ��main�����Ĳ���������´��ݵ������С�
 * @ID 1806050126
 * @author ���1801����
 */
import java.util.*;

public class Test7_1 {

	public static void main(String[] args) {
		Calendar ���� = Calendar.getInstance();
		����.set(2000,9,1);//2000��10��1
		int ���ڼ�=����.get(Calendar.DAY_OF_WEEK)-1;
		String a[]=new String[���ڼ�+31];
				for(int i=0;i<���ڼ�;i++) {
					a[i] =" ";
				}
		for(int i=���ڼ�,n=1;i<���ڼ�+31;i++) {
			 a[i]=String.valueOf(n) ;
			n++;
		}
	
System.out.printf("%6c%6c%6c%6c%6c%6c%6c\n",'��','һ','��','��','��','��','��');
for(int i=0;i<a.length;i++){
	if(i%7==0&&i!=0)
		System.out.println("\n");
	System.out.printf("%3s",a[i]);
}
	}

}
