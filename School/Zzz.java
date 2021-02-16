package zhangxin3;


import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Zzz {
  public static void main(String[] args) {
      JFrame jf = new JFrame("Jframe");
      jf.setLayout(new FlowLayout());
      jf.setSize(300,200);      
      jf.setVisible(true);     
      jf.setLocation(800,200);   
      final JLabel lb = new JLabel("此处显示鼠标右键点击后的坐标");   
      jf.add(lb);     
      jf.addMouseListener(new MouseListener() {   
    
        public void mousePressed(MouseEvent e) {
          
          if(e.getButton()==MouseEvent.BUTTON3){    
            lb.setText(e.getX()+","+e.getY());   
           }
        }
        @Override
        public void mouseClicked(MouseEvent e) {
          // TODO Auto-generated method stub
 
        }
 
        @Override
        public void mouseReleased(MouseEvent e) {
          // TODO Auto-generated method stub
 
        }
 
        @Override
        public void mouseEntered(MouseEvent e) {
          // TODO Auto-generated method stub
 
        }
 
        @Override
        public void mouseExited(MouseEvent e) {
          // TODO Auto-generated method stub
 
        }
 
 
      });
      }
 
      }