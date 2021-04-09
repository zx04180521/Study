package two;
/**
 * 
 * @author 软件1801 张鑫
 *
 */
public class Example2_5 {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {10,11};
		System.out.println("数组a的引用是："+a);
		System.out.println("数组b的引用是："+b);
		System.out.printf("b[0]=%-3db[1]=%-3d%n",b[0],b[1]);
		b=a;
		System.out.println("数组a的引用是："+a);
		System.out.println("数组b的引用是："+b);
		b[1]=888;
		b[2]=999;
		System.out.printf("a[0]=%-5d a[1]=%-5d a[2]=%-5d\n",a[0],a[1],a[2]);
		System.out.printf("b[0]=%-5d b[1]=%-5d b[2]=%-5d\n",b[0],b[1],b[2]);
	}

}
