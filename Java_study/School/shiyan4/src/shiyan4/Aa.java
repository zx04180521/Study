package shiyan4;
/**
 * @author ���1801����
 * @ID  1806050126
 * @DATE  2020/5/25
 * 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
@SuppressWarnings("serial")
public class Aa extends JFrame 
{

	/**
	 * �ұߵİ�ť
	 */
	JButton buttonRight;
	/**
	 * ��ߵİ�ť
	 */
	JButton buttonLeft;
	/**
	 * ��ߵ��ı���
	 */
	JTextArea textLeft;
	/**
	 * �ұߵ��ı���
	 */
	JTextArea textRight;

	
	/**
	 * ���캯������ÿ���齨����ֵ���趨������λ��
	 */
	Aa() 
	{
		buttonLeft = new JButton("�ֵ�����");
		buttonRight = new JButton("���");
		textLeft = new JTextArea();
		textRight = new JTextArea();
		this.setLayout(null);
		this.add(textLeft);
		this.setBounds(200, 200, 800, 400);
		textLeft.setBounds(200, 20, 100, 200);
		textLeft.setVisible(true);
		this.add(textRight);
		textRight.setBounds(500, 20, 100, 200);
		textRight.setVisible(true);
		textRight.setEditable(false);
		this.add(buttonLeft);
		buttonLeft.setBounds(200, 300, 100, 20);
		buttonLeft.setVisible(true);
		buttonLeft.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				sort();
			}
		});
		this.add(buttonRight);
		buttonRight.setBounds(500, 300, 100, 20);
		buttonRight.setVisible(true);
		buttonRight.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				clear();
			}
		});
		setVisible(true);
		validate();
	}

	/**
	 * �������ı�����������
	 */
	
	private void clear() 
	{
		textLeft.setText("");
		textRight.setText("");
	}

	/**
	 * ����getWords������ȡ����ı����еĵ��ʣ� ����dictionary�������������пպ����ұ��ı��������ÿ������һ��
	 */
	private void sort() 
	{
		String[] words = getWords();
		dictionary(words);
		for (int i = 0; i < words.length; i++)
		{
			if (words[i].equals(null)) 
			{
				return;
			}
			System.out.println(words[i]);
			textRight.append(words[i] + "\n");
		}
	}

	/**
	 * @param words
	 *            ����ı����л�ȡ�ĵ������飬String���� ��ԭ��������ð�ݷ��������е��ַ������ֵ�������
	 **/
	private void dictionary(String[] words) 
	{
		for (int i = 0; i < words.length; i++) 
		{
			if (words[i].equals(null)) 
			{
				return;
			}
			for (int j = i + 1; j < words.length; j++)
			{
				if (words[i].compareTo(words[j]) > 0)
				{
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
	}

	/**
	 * @return String���飬��������ı����д���ĸ���ַ��� ��ȡ����ı����е���ĸ����\n��Ϊ���з����зָ���������д���ĸ���ַ�����
	 *         �����õ����ַ������鷵��
	 */
	private String[] getWords()
	{
		String left = textLeft.getText();
		StringTokenizer token = new StringTokenizer(left, "\n");
		int count = token.countTokens();
		String[] words = new String[count];
		int i = 0;
		while (token.hasMoreTokens()) 
		{
			String current = token.nextToken();
			if (current.matches("\\p{Alpha}+"))
			{
				words[i] = current;
				i++;
			}
		}
		String[] result = new String[i];
		for (int j = 0; j < i; j++) 
		{
			result[j] = words[j];
		}
		return result;
	}
	public static void main(String[] args) {
		Aa m=new Aa();
}
		
	}

