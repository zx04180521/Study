package shiyan;
/**
 * 贪心猪游戏
 * @ID 1806050126
 * @author 软件1801张鑫
 */
import java.util.Scanner;

public class Piggame {

	public static void main(String[] args) {


Player p=new Player();//玩家类对象
Computer c=new Computer();//电脑类对象
System.out.println("玩家先掷骰子") ;
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
System.out.println(p.score >= 100 ? "玩家获胜" : "电脑获胜") ;
System.out.println("玩家得分"+p.score);
System.out.println("电脑得分"+c.score);
	}

}
class Game
{
	 int score;
	 boolean state;//真为玩家回合，假为电脑回合
	 int dice() {
		int random=(int)(Math.random()*6)+1;
		System.out.println("本轮点数"+random);
		return random;
	}//随机掷骰子的点数
	 int getScore() {return score;}
	 void setScore(int score) { this.score = score ;}
	 boolean getState() { return state ;}
	 void setState(boolean state) {this.state = state ;}
	}
class Player extends Game//玩家类
/**
 * 玩家进行游戏，当掷出1时不保留得分,本轮结束
 * 当掷出[2,6]的整数，由玩家选择是否继续。
 *继续则继续执行play（）方法，否则结束本轮
 */
{
	int count;//当前点数
    Player(){
	score=0;
	state=true;
}	// 初始条件：得分为0 ，状态为真（玩家先手）
  
void play()//玩家抛出1，本轮结束；抛出2-6，选择是否继续，继续则继续执行play（）方法，否则结束本轮
{
	 {System.out.println("--------------------玩家回合-----------------------------");}
    count=dice ();
    if(count==1) {System.out.println("本轮没有得分");
    System.out.println("\n\n\n");
    state=!state;
    }
    else {
    	
    	if(choice()){play();}
    	else 
    	{
    		score+=count;
    		System.out.println("玩家总分"+score);
    		System.out.println("\n\n\n");
    		state=!state;
    	}
    	
    }
}


@SuppressWarnings("resource")
boolean choice() //玩家输入r或h决定是否继续
{
	System.out.println("玩家可以输入“r”重掷色子，或者输入“h”保留得分");
	
	Scanner saa=new Scanner(System.in);
	String a=saa.next();
	if(a.equals("h"))
		{return false;}

	if (a.equals("r")) 
	{return true;}

	else
	{
		System.out.println("请输入正确的选择");
		return choice();
	}


}
}//玩家输入r或h决定是否继续

class Computer extends Game
/** 
 * 机器玩家掷出1或得分大于20时本轮停止
 * 掷出[2,6]的整数时，将得分累加。
 * 在本轮得分大于20时，返回本轮得分。
 */
{
	int count;//骰子点数
int  nowscore=0;//本轮得分
	Computer(){
		score=0;
		
	}
	void play() //电脑掷骰子，不出现1则一直累加到20，否则结束，不得分
	{
		System.out.println("--------------------------机器回合---------------------------");
		 count=dice();
		while(count!=1&&nowscore<=20)
		{
			nowscore+=count;
			count=dice();
		}
		if(count==1) {
			System.out.println("本轮无得分");
		System.out.println("\n\n\n");}
		if(nowscore>20)
		{
			System.out.println("本轮得分"+nowscore);
			score+=nowscore;
			state = !state ;
			nowscore=0;
			System.out.println("电脑总分"+score);
			System.out.println("\n\n\n");
		}
	}
	
}