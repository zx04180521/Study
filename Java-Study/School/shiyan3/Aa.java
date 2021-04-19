package shiyan3;
/**
 * @author 软件1801张鑫
 * @ ID 1806050126
 * 在words.txt文件中包含了87314个单词，编写Java程序从words文件中读取单词，并输出重复字母对最多的单词，将最多重复字母对的单词写入newwords.txt文件中。
 * @Date  2020/5/19
 */
import java.io.*;
/**
 * 查找单词表中的重复字母对，并输出重复字母最多的单词，如果有多个重复次数相同的单词，输出第一个单词
 **/
public class Aa 
{
	public static void main(String[] args) 
	{
		
		getWords("words.txt");//输出结果
	}
	/**
	 * 标记重复字母的个数
	 * */
	private static int number=0;
	/**
	 * 记录第一个重复字母对最多的单词
	 * */
	private static String result;

	/**
	 *String类，要读取字符串的文件名 输入一个当前目录下的文件名，对其中的字符串进行读取
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
			System.out.println("重复字母对最多的单词是：\n" + result + "\n重复字母对个数：\n"
					+ number);
		} 
		catch (IOException e)
		{
			System.out.println(e);
		}
	}

	/**
	 *  要判断的单词 输入一个读取到的字符串，判断该字符串的重复字母对是否是最多的，以及是否是第一个拥有最多重复字母对的单词
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
	 *要查找重复字母对的单词数
	 *当前单词里重复字母对的个数 有几个重复字母对，返回重复字母对的个数
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
	 * 读取要写入的字符串 将重复字母对最多的单词写入文件
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
