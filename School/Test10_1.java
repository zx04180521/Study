package ten;
/**
 * 
 *  编写一个应用程序，包括3个文本框，设计4个按钮，分别命名为“加”、“减”、“乘“、”除”单击相应的按钮，将两个文本框的数字做运算，在第三个文本框中显示出来。
 * @author 软件1801张鑫
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
        setTitle("计算");
        jia = new JButton("加");
        jian = new JButton("减");
        cheng = new JButton("乘");
        chu = new JButton("除");
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
                three.setText("请输入数字字符");
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
                three.setText("请输入数字字符");
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
                three.setText("请输入数字字符");
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
                three.setText("请输入数字字符");
            }
        }
        validate();
    }

    @SuppressWarnings("unused")
	public static void main(String[] args) {
        Test10_1 test = new Test10_1();
    }
}

	
