package zhangxin3;
/**
 * 乘法口诀表
 * @author 张鑫
 *
 */
public class Zx4 {

	public static void main(String[] args) {
		for(int i=1;i<10;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.printf(j+"x"+i+"="+j*i+" ");
			}
			System.out.println();
			
		}

	}

}
