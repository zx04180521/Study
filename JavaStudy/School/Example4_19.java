package four;
/**
 * 对象数组
 * @author 张鑫
 *
 */
public class Example4_19 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Integer[] m=new Integer[10];
for(int i=0;i<m.length;i++) 
{
	m[i]=new Integer(101+i);
			}
for(int i=0;i<m.length;i++)
{
System.out.println(m[i].intValue());	
}
	}

}
