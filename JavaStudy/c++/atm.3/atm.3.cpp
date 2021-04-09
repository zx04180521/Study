#include<iostream>
#include<string>
using namespace std;
class Atm
{
public:
	Atm(Consumer & a);
	void welcome();
	void function();
	void check_password(string password);
	void change_password();
	void withdraw(int a);
	void information(string name, int num, int money);
	void lock();
	void quit();
private:
	 Consumer &u;
	string password;
	int n;
	string name;
	int num;
	int money;
};
class Consumer
{

public:

	int get_num;
	string get_password;
	int get_money;
	Consumer(string Name, int get_Num, string get_Password, int get_Money) :name("zx"), get_num(123456789), get_password("123123"), get_money(100000000) {}


	string name;

};
Atm::Atm(Consumer& a) :u(a)
{
	password = a.get_password;
	n = a.get_money;
	name = a.name;
	num = a.get_money;
	
}
Consumer::Consumer(string Name, int get_Num, string get_Password, int get_Money)
{
	name = Name;
	get_num = get_Num;
	get_password = get_Password;
	get_money = get_Money;
}
void Atm::welcome()
{
	cout << "欢迎使用ATM自助查询系统" << endl;
}
void Atm::check_password(string password)
{
	string password;

	cout << "请输入您的密码 " << endl;
	cin >> password;
	if (password== password)
		function();

	else
		cout << "密码错误" << endl;
	lock();
}
void Atm::change_password()
{
	string newpassword1[6];
	string newpassword2[6];
	cout << "请输入您的新密码：";
	cin >> newpassword1[6];
	cout << "再次输入您的密码：";
	cin >> newpassword2[6];
	if (newpassword1[6] == newpassword2[6])
		cout << "修改成功";
	else
		cout << "两次密码不一致" << endl;
}
void Atm::lock()
{
	cout << "你的卡被锁定" << endl;
}
void Atm::withdraw(int n)
{
	int m;
	int money;
	cout << "请输入取款金额" << endl;
	cin >> m;
	
	if (m <= n)
	{
		cout << "您的余额是：" << (n - m) << endl;
		
	}
	else
	{
		cout << "您的余额不足" << endl;
	}
}
void Atm::information(string name,int num,int money)
{
	cout << "用户姓名：" << name << endl;
	cout << "卡号：" << num << endl;
	cout << "余额" << money << endl;

}
void Atm::quit()
{
	cout << "请拔出您的卡片" << endl;
}
void Atm::function()

{
	int i;
	cout << "请输入您需要的操作：" << endl;
	cout << "1、查询信息" << endl;
	cout << "2、取钱" << endl;
	cout << "3、修改密码" << endl;
	cout << "4、退出" << endl;
	cin >> i;
	if (i > 4 || i < 1) {
		cout << "有误";
		cout << "再次输入";
		cin >> i;
	}
	else switch (i)
	{
	case(1):information; break;
	case(2):withdraw; break;
	case(3):change_password; break;
	case(4):quit(); break;
	}
}
int main()
{
	Atm atm();
	atm().function();
	return 0;

}










