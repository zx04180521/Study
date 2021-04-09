package ten;
/**
 * 
 *  ��дһ��Ӧ�ó��򣬰���3���ı������4����ť���ֱ�����Ϊ���ӡ��������������ˡ���������������Ӧ�İ�ť���������ı�������������㣬�ڵ������ı�������ʾ������
 * @author ���1801����
 * @ID 1806050126
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Test10_1 extends JFrame implements ActionListener {
    JButton jia;
    JButton jian;
    JButton cheng;
    JButton chu;
    JTextField one;
    JTextField two;
    JTextField three;
    JLabel label;

    public Test10_1() {
        init();
        setVisible(true);
        setResizable(true);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void init() {
        setLayout(new FlowLayout());
        setSize(300, 320);
        setTitle("����");
        jia = new JButton("��");
        jian = new JButton("��");
        cheng = new JButton("��");
        chu = new JButton("��");
        one = new JTextField(10);
        two = new JTextField(10);
        three = new JTextField(10);
        label = new JLabel(" ", JLabel.CENTER);
        label.setBackground(Color.green);
        add(one);
        add(label);
        add(two);
        add(three);
        add(jia);
        add(jian);
        add(cheng);
        add(chu);
        jia.addActionListener(this);
        jian.addActionListener(this);
        cheng.addActionListener(this);
        chu.addActionListener(this);

    }

   
    public void actionPerformed(ActionEvent e) {
        double n;
        if (e.getSource() == jia) {
            double n1, n2;
            try {
                n1 = Double.parseDouble(one.getText());
                n2 = Double.parseDouble(two.getText());
                n = n1 + n2;
                three.setText(String.valueOf(n));
                label.setText("+");
            } catch (NumberFormatException ee) {
                three.setText("�����������ַ�");
            }
        } else if (e.getSource() == jian) {
            double n1, n2;
            try {
                n1 = Double.parseDouble(one.getText());
                n2 = Double.parseDouble(two.getText());
                n = n1 - n2;
                three.setText(String.valueOf(n));
                label.setText("-");
            } catch (NumberFormatException ee) {
                three.setText("�����������ַ�");
            }
        } else if (e.getSource() == cheng) {
            double n1, n2;
            try {
                n1 = Double.parseDouble(one.getText());
                n2 = Double.parseDouble(two.getText());
                n = n1 * n2;
                three.setText(String.valueOf(n));
                label.setText("*");
            } catch (NumberFormatException ee) {
                three.setText("�����������ַ�");
            }
        } else if (e.getSource() == chu) {
            double n1, n2;
            try {
                n1 = Double.parseDouble(one.getText());
                n2 = Double.parseDouble(two.getText());
                n = n1 / n2;
                three.setText(String.valueOf(n));
                label.setText("/");
            } catch (NumberFormatException ee) {
                three.setText("�����������ַ�");
            }
        }
        validate();
    }

    @SuppressWarnings("unused")
	public static void main(String[] args) {
        Test10_1 test = new Test10_1();
    }
}

	
