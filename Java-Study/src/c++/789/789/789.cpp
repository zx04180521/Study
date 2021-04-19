#include <iostream>
using namespace std;
class Date
{
public:
	void setDate(int y, int m, int d)
	{

		year = y;
		month = m;
		day = d;

	}
	void showDate()
	{
		cout << year << "." << month << "." << day << endl;

	}
	Date(int y, int m, int d)
	{}
private:
	int year;
	int month;
	int day;

};

int main()
{
	Date date1(2000,10,14);
	date1.setDate();
	date1.showDate();
	return 0;
}
