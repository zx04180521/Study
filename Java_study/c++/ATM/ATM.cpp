#include<iostream>
#include<string.h>
#include<stdio.h>
#include <stdlib.h>
using namespace std;

class consumer;

class ATM
{
public:
	ATM(consumer& cn) :cnsm(cn)
	{
	}
	void welcome();   //登陆界面
	bool check_passwd(char n[], char pwd[]);    //核对密码
	void change_passwd();    //修改密码
	void fetchmoney();   //取款
	void information();     //查询信息
	void exitATM();       //退出系统
	void functionshow();        //功能界面
	void lock();         //锁机
private:
	int times;     //记录密码输入次数
	consumer& cnsm;
};


class consumer          //用户
{
public:
	friend class ATM;
	consumer(char Name[], char Num[], float Money, char Password[]);
protected:
	char* get_name();   //取得姓名
	char* get_kahao();    //取得卡号
	char* get_passwd();   //取得密码
	float get_money();    //取得余额
	void set_passwd(char pwd[]);   //设置密码
	void set_money(float m);    //取钱


private:
	char passwd[10];   //用户密码
	char name[20];     //用户姓名
	char kahao[20];    //用户卡号
	float money;      //用户余额        
};


consumer::consumer(char Name[], char Kahao[], float Money, char Password[])       //构造函数，建立账户
{
	strcpy(name, Name);
	strcpy(kahao, Kahao);
	money = Money;
	strcpy(passwd, Password);
}

float consumer::get_money()    //取得余额
{
	return money;
}

char* consumer::get_name()   //取得姓名
{
	return name;
}

char* consumer::get_kahao()   //取得卡号
{
	return kahao;
}


char* consumer::get_passwd()   //取得密码
{
	return passwd;
}

void consumer::set_passwd(char pwd[])//设置密码
{
	strcpy(passwd, pwd);
}

void ATM::welcome()  //登录界面
{
	times = 0;
	cout << "*欢迎使用银行ATM自动取款机*" << endl;
	char pwd[10], num[20], ch;
	int i = 0;
	do
	{
		i = 0;
		cout << endl << "请输入卡号:";
		do
		{
			cin.get(ch);
			num[i++] = ch;
		} while (ch != '\n');
		num[i - 1] = '\0';
		i = 0;
		cout << "请输入密码:";
		do
		{
			cin.get(ch);
			pwd[i++] = ch;
		} while (ch != '\n');
		pwd[i - 1] = '\0';
		if (!check_passwd(num, pwd))
		{
			cout << "你输入的卡号或密码有误，请从新输入" << endl;
			times++;
		}
		else
		{
			functionshow();
		}
	} while (times < 3);
	lock();
}

bool ATM::check_passwd(char num[], char pwd[])
{
	if (strcmp(num, cnsm.get_kahao()) == 0 && strcmp(pwd, cnsm.get_passwd()) == 0)
		return true;
	else
		return false;
}

void ATM::functionshow()
{
	int n;
	do
	{
		cout << endl << "请输入相应的操作序号进行操作:  " << endl;
		cout << "1)修改密码 " << endl
			<< "2)取款        " << endl
			<< "3)查询余额 " << endl
			<< "4)退出系统 " << endl;
		cout << "$>\\";
		cin >> n;
		while (n < 1 || n>4)
		{
			cout << "请输入正确的操作序号!" << endl;
			cout << "$>\\";
			cin >> n;
		}
		switch (n)
		{
		case 1:  change_passwd();
			break;
		case 2:  fetchmoney();
			break;
		case 3:  information();
			break;
		case 4:  exitATM();
			break;
		}
	} while (true);
}


void ATM::change_passwd()
{
	char pwd[10], repwd[10];
	times = 0;
	do
	{
		cout << endl << "请输入旧密码:";
		cin >> pwd;
		if (!check_passwd(cnsm.get_kahao(), pwd))
			times++;
		else
			break;
	} while (times < 3);
	if (times == 3)
		lock();
	int k = 0;
	int t = 0;
	do
	{
		k = 0;
		cout << "请输入新密码:";
		cin >> pwd;
		int g = 0;
		int v = 0;
		g = strlen(pwd);
		if (g < 6)
		{
			k = 1;
			cout << "密码不能小于6位" << endl;
		}
		for (int i = 0; i < g - 1; i++)
		{
			if (pwd[i] == pwd[i + 1])
				v = v + 1;
		}
		if (v == g)
		{
			k = 1;
			cout << "对不起，不允许出现完全相同的情况" << endl;
		}
		if (g > 6 && v != g)
		{
			cout << "请再输入一次新密码:";
			cin >> repwd;
			if ((t = strcmp(pwd, repwd)) != 0)
			{
				cout << "你输入的两次密码不一样，请重新输入!" << endl;
			}
		}
	} while (t != 0 || k == 1);
	cnsm.set_passwd(pwd);
	cout << "密码修改成功，请牢记！" << endl;
}


void ATM::fetchmoney()
{
	float m;
	char ch;
	do
	{
		cout << endl << "你要取多少钱：" << "\n$>\\";
		cin >> m;
		while (m <= 0)
		{
			cout << "请输入正确的数字!" << endl;
			cout << "$>\\";
			cin >> m;
		}
		if (m > 5000)
		{
			cout << "对不起，每次最多取5000元" << endl;
		}
		else
		{
			if ((int)m % 100 != 0)
			{
				cout << "对不起，取款金额为100的倍数" << endl;
			}
			else
			{
				if (cnsm.get_money() - m < 0)
				{
					cout << "对不起，你的余额不足！" << endl;
				}
				else
				{
					cout << endl << "操作成功，请收好钱！" << endl;
					cnsm.set_money(m);
				}
			}
		}
		cout << "是否要继续该项操作：(Y/N)" << endl;
		cout << "$>\\";
		cin >> ch;
		while (ch != 'n' && ch != 'Y' && ch != 'y')
		{
			cout << "$>\\";
			cin >> ch;
		}
	} while (ch == 'y' || ch == 'Y');
}

void ATM::information()//信息页面
{
	cout << "**************************" << endl;
	cout << "*" << endl;
	cout << "*     用户姓名:" << cnsm.get_name() << endl;
	cout << "*    卡号:     " << cnsm.get_kahao() << endl;
	cout << "*     余额:   " << cnsm.get_money() << endl;
	cout << "**************************" << endl;
}

void ATM::lock()
{
	cout << endl << "感谢你对本银行的支持，欢迎下次光临！" << endl;
	cout << "请取卡......." << endl;

}

void ATM::exitATM()
{
	cout << "成功退出系统！谢谢惠顾！" << endl;
	exit(0);
}


void consumer::set_money(float m)
{
	money = money - m;
}


int  main()
{
	consumer c1("Me", "123456", 10000.00F, "666888");//构造一个用户
	ATM atm(c1);
	atm.welcome();
	return 0;

