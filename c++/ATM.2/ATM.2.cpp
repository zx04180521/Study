#include<iostream>
#include<string>
using namespace std;

class ATM
{
publuc:
	ATM(consumer& cn);
	void wellcome();//打开欢迎界面
	void function();//操作界面
	bool check_passwd(char passwd[]);//核对密码
	void change_passwd();//修改密码
	void get_money();//取款
	void information();//查询信息
	void quit();//退出系统

	~ATM();
	consumer& cnsm;


}；
ATM::ATM(const consumer& cn) :cnsm(cn) {}
ATM::~ATM()
void ATM::wellcom()
{
	cout << "欢迎使用ＡＴＭ机自助服务系统" << endl << "请插入您的银行卡" << endl;

	char passwd[8];
	cout << "请输入密码" << endl;
	cin >> passwd;
	if (check_passwd(passwd))
	{
		function();
	}
	else
		cout << "密码错误" << endl;
}
bool ATM::check_passwd(char passwd[])
{
	if (strcmp(passwd, cnsm.get_passwd()) == 0)
		return true;
	else
		return false;
}

void ATM::change_passwd()
{
	char passwd[8], repasswd[8];
	cout << "请输入您要修改的密码：" << endl;
	cin >> passwd;
	cout << "请再次输入您要修改的密码：" << endl;
	cin >> repasswd;
	if (strcmp(passwd, repasswd) == 0)
		cout << "成功修改密码"；
}
void ATM::get_money()
{
	int m, n;
	cout << "请输入取款金额" << endl;
	cin >> m;
	n = cnsm.get_money();
	if (m <= n)
	{
		cout << "您的余额是：" << (n - m) << endl;
		cnsm.set_money(n - m);
	}
	else
	{
		cout << "您的余额不足" << endl;
	}
}
void ATM::information()
{
	cout << "用户姓名：" << cnsm.get_name() << endl;
	cout << "卡号：" << cnsm.get_num() << endl;
	cout << "余额" << cnsm.get_money() << endl;
}
void ATM::function()
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
	case(1):information(); break;
	case(2):get_money(); break;
	case(3):change_passwd(); break;
	case(4):quit(); break;
	}




	class consumer //用户类
	{
	public:
			consumer(char Name[], char Num, int Money, char Passwd[]);
		~consumer();
		void set_passwd(char psd[]);//设置密码
		void set_money(int m);//存钱
		char* get_name();
		char* get_num();
		int get_money();
		char* get_passwd();
	private:
		char name[20];
		char num[20];
		char passwd[6];
		int money;

	};
	consumer::consumer(char name[], char num, int money, char passwd[])
	{
		strcpy(name, Name);
		strcpy(num, Num);
		moner = Money;
		strcpy(passwd, Passwd);

	}
	char* consumer::get_name()
	{
		return name
	}
	char* consumer::get_num()
	{
		return num;
	}
	char* consumer::get_passwd() {
		return passwd;
	}
	int consumer::get_money() {
		return monry;
	}
	void consumer::set_passwd(char psd[]) {
		strcpy(passwd, psd);
	}
	void consuner::set_money(int m) {
		monry = m;
	}
	consumer::~consumer() {}

	int main() {
		consumer danny("zhang", "2000041811", "1000", "123456");
		ATM atm(danny);
		atm.wellcome();

	}


