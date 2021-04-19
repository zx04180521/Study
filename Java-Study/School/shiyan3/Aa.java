package shiyan3;
/**
 * @author ���1801����
 * @ ID 1806050126
 * ��words.txt�ļ��а�����87314�����ʣ���дJava�����words�ļ��ж�ȡ���ʣ�������ظ���ĸ�����ĵ��ʣ�������ظ���ĸ�Եĵ���д��newwords.txt�ļ��С�
 * @Date  2020/5/19
 */
import java.io.*;
/**
 * ���ҵ��ʱ��е��ظ���ĸ�ԣ�������ظ���ĸ���ĵ��ʣ�����ж���ظ�������ͬ�ĵ��ʣ������һ������
 **/
public class Aa 
{
	public static void main(String[] args) 
	{
		
		getWords("words.txt");//������
	}
	/**
	 * ����ظ���ĸ�ĸ���
	 * */
	private static int number=0;
	/**
	 * ��¼��һ���ظ���ĸ�����ĵ���
	 * */
	private static String result;

	/**
	 *String�࣬Ҫ��ȡ�ַ������ļ��� ����һ����ǰĿ¼�µ��ļ����������е��ַ������ж�ȡ
	 **/
	public static void getWords(String fileName) 
	{
		File file = new File(fileName);
		try
		{
			FileReader reader = new FileReader(file);
		
			BufferedReader buffer = new BufferedReader(reader);
			String word = new String();
			while ((word = buffer.readLine()) != null) {
				choose(word);
		}
			System.out.println("�ظ���ĸ�����ĵ����ǣ�\n" + result + "\n�ظ���ĸ�Ը�����\n"
					+ number);
		} 
		catch (IOException e)
		{
			System.out.println(e);
		}
	}

	/**
	 *  Ҫ�жϵĵ��� ����һ����ȡ�����ַ������жϸ��ַ������ظ���ĸ���Ƿ������ģ��Լ��Ƿ��ǵ�һ��ӵ������ظ���ĸ�Եĵ���
	 **/
	private static void choose(String word) 
	{
		int current = count(word);
		if (current > number)
		{
			number = current;
			result = word;
			File file = new File("newwords.txt");
			file.delete();
		}
		if (current == number)
		{
			writeWords(word);
		}
	}

	/**
	 *Ҫ�����ظ���ĸ�Եĵ�����
	 *��ǰ�������ظ���ĸ�Եĸ��� �м����ظ���ĸ�ԣ������ظ���ĸ�Եĸ���
	 * */
	public static int count(String word) 
	{
		int sum = 0;
		for (int i = 0; i < word.length() - 1; i++)
		{
			if (word.charAt(i) == word.charAt(i + 1))
			{
				sum++;
			}
		}
		// System.out.println(sum);
		return sum;
	}

	/**
	 * ��ȡҪд����ַ��� ���ظ���ĸ�����ĵ���д���ļ�
	 * */
	private static void writeWords(String word)
	{
		try
		{
			File file = new File("newwords.txt");
			FileWriter newFile = new FileWriter(file, true);
			BufferedWriter writer = new BufferedWriter(newFile);
			writer.write(word);
			writer.newLine();
			writer.flush();
			writer.close();
		} 
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}
