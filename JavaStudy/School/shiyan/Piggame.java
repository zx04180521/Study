package shiyan;
/**
 * ̰������Ϸ
 * @ID 1806050126
 * @author ���1801����
 */
import java.util.Scanner;

public class Piggame {

	public static void main(String[] args) {


Player p=new Player();//��������
Computer c=new Computer();//���������
System.out.println("�����������") ;
while (p.getScore() < 100 && c.getScore() < 100)
{	
	if (p.getState())
	{
		p.play() ;
		c.setState(true) ;
	}
if (c.getState()) {
		c.play() ;
		p.setState(true) ;
		
	}
	
}
System.out.println(p.score >= 100 ? "��һ�ʤ" : "���Ի�ʤ") ;
System.out.println("��ҵ÷�"+p.score);
System.out.println("���Ե÷�"+c.score);
	}

}
class Game
{
	 int score;
	 boolean state;//��Ϊ��һغϣ���Ϊ���Իغ�
	 int dice() {
		int random=(int)(Math.random()*6)+1;
		System.out.println("���ֵ���"+random);
		return random;
	}//��������ӵĵ���
	 int getScore() {return score;}
	 void setScore(int score) { this.score = score ;}
	 boolean getState() { return state ;}
	 void setState(boolean state) {this.state = state ;}
	}
class Player extends Game//�����
/**
 * ��ҽ�����Ϸ��������1ʱ�������÷�,���ֽ���
 * ������[2,6]�������������ѡ���Ƿ������
 *���������ִ��play���������������������
 */
{
	int count;//��ǰ����
    Player(){
	score=0;
	state=true;
}	// ��ʼ�������÷�Ϊ0 ��״̬Ϊ�棨������֣�
  
void play()//����׳�1�����ֽ������׳�2-6��ѡ���Ƿ���������������ִ��play���������������������
{
	 {System.out.println("--------------------��һغ�-----------------------------");}
    count=dice ();
    if(count==1) {System.out.println("����û�е÷�");
    System.out.println("\n\n\n");
    state=!state;
    }
    else {
    	
    	if(choice()){play();}
    	else 
    	{
    		score+=count;
    		System.out.println("����ܷ�"+score);
    		System.out.println("\n\n\n");
    		state=!state;
    	}
    	
    }
}


@SuppressWarnings("resource")
boolean choice() //�������r��h�����Ƿ����
{
	System.out.println("��ҿ������롰r������ɫ�ӣ��������롰h�������÷�");
	
	Scanner saa=new Scanner(System.in);
	String a=saa.next();
	if(a.equals("h"))
		{return false;}

	if (a.equals("r")) 
	{return true;}

	else
	{
		System.out.println("��������ȷ��ѡ��");
		return choice();
	}


}
}//�������r��h�����Ƿ����

class Computer extends Game
/** 
 * �����������1��÷ִ���20ʱ����ֹͣ
 * ����[2,6]������ʱ�����÷��ۼӡ�
 * �ڱ��ֵ÷ִ���20ʱ�����ر��ֵ÷֡�
 */
{
	int count;//���ӵ���
int  nowscore=0;//���ֵ÷�
	Computer(){
		score=0;
		
	}
	void play() //���������ӣ�������1��һֱ�ۼӵ�20��������������÷�
	{
		System.out.println("--------------------------�����غ�---------------------------");
		 count=dice();
		while(count!=1&&nowscore<=20)
		{
			nowscore+=count;
			count=dice();
		}
		if(count==1) {
			System.out.println("�����޵÷�");
		System.out.println("\n\n\n");}
		if(nowscore>20)
		{
			System.out.println("���ֵ÷�"+nowscore);
			score+=nowscore;
			state = !state ;
			nowscore=0;
			System.out.println("�����ܷ�"+score);
			System.out.println("\n\n\n");
		}
	}
	
}