#pragma warning(disable:4996)
#include<iostream>
#include<windows.h>
#include <conio.h>
#include<time.h>
using namespace std;
//地图初始化

int map[30][18] =
{
	1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
	1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
};
char ch = '0'; int n = 0;
//画出地图

void drawMap()
{
	cout << "徐青云的俄罗斯方块" << endl;

	for (int i = 0; i < 30; i++)
	{
		for (int j = 0; j < 18; j++)
			switch (map[i][j])
			{
			case 0:
				cout << "  ";
				break;
			case 1:
				cout << "□";
				break;
			case 2:
				cout << "■";
				break;
			}
		cout << endl;
	}
}
//形状类
class Shape
{
public:
	int a0, a1, a2, a3, b0, b1, b2, b3;
	//初始化
	virtual void init()
	{
		map[a0][b0] = 2; map[a1][b1] = 2; map[a2][b2] = 2; map[a3][b3] = 2;
	}
	//清除形状
	virtual void clean()
	{
		map[a0][b0] = 0; map[a1][b1] = 0; map[a2][b2] = 0; map[a3][b3] = 0;
	}

	//点击
	virtual void click(char ch) {};
	//下落 
	virtual void fall() {};
	//判断形状是否到底
	virtual bool shape_is_botton_adjacent() { return true; };
	//判断形状是否可向下移动
	bool fall_moveable();
	//判断形状是否可向左移动
	bool laft_moveable();
	//判断形状是否可向右移动
	bool right_moveable();
	//判断方块是否着陆
	bool is_block_adjacent(int a, int b)
	{
		if (map[a][b] != 0)
			return true;
		else return false;
	}
};
//“田”形状类
class Tian :public Shape
{
public:
	Tian(int a_0 = 1, int a_1 = 1, int a_2 = 2, int a_3 = 2, int b_0 = 8, int b_1 = 9, int b_2 = 8, int b_3 = 9)
	{
		a0 = a_0, a1 = a_1, a2 = a_2, a3 = a_3, b0 = b_0, b1 = b_1, b2 = b_2, b3 = b_3;
	}
	void fall()
	{
		if (fall_moveable() == true)
		{
			clean();
			a0++; a1++; a2++; a3++;
		}
	}
	void click(char ch)
	{
		switch (ch)
		{
		case'a':
		{
			if (laft_moveable() == true)
			{
				clean();
				b0--; b1--; b2--; b3--;
			}
			break;
		}
		case'd':
		{
			if (right_moveable() == true)
			{
				clean();
				b0++; b1++; b2++; b3++;
			}
			break;
		}
		case's':
		{
			if (fall_moveable() == true)
			{
				clean();
				a0++; a1++; a2++; a3++;
			}
			break;
		}
		}
	}
	bool fall_moveable()
	{
		if (map[a2 + 1][b2] == 0 && map[a3 + 1][b3] == 0)
			return true;
		else return false;
	}
	bool laft_moveable()
	{
		if (map[a0][b0 - 1] == 0 && map[a2][b2 - 1] == 0)
			return true;
		else return false;
	}
	bool right_moveable()
	{
		if (map[a1][b1 + 1] == 0 && map[a3][b3 + 1] == 0)
			return true;
		else return false;
	}
	bool shape_is_botton_adjacent()
	{
		if (is_block_adjacent(a2, b2) || is_block_adjacent(a3, b3))
			return true;
		else return false;
	}

};
//“|”形状类
class Shu :public Shape
{
public:
	Shu(int a_0 = 1, int a_1 = 2, int a_2 = 3, int a_3 = 4, int b_0 = 9, int b_1 = 9, int b_2 = 9, int b_3 = 9)
	{
		a0 = a_0, a1 = a_1, a2 = a_2, a3 = a_3, b0 = b_0, b1 = b_1, b2 = b_2, b3 = b_3;
	}
	void click(char ch)
	{
		switch (ch)
		{
		case'a':
		{
			if (laft_moveable() == true)
			{
				clean();
				b0--; b1--; b2--; b3--;
			}
			break;
		}
		case'd':
		{
			if (right_moveable() == true)
			{
				clean();
				b0++; b1++; b2++; b3++;
			}
			break;
		}
		case's':
		{
			if (fall_moveable() == true)
			{
				clean();
				a0++; a1++; a2++; a3++;
			}
			break;
		}
		}
	}
	void fall()
	{
		if (fall_moveable() == true)
		{
			clean();
			a0++; a1++; a2++; a3++;
		}
	}
	bool fall_moveable()
	{
		if (map[a3 + 1][b3] == 0)
			return true;
		else return false;
	}
	bool laft_moveable()
	{
		if (map[a0][b0 - 1] == 0 && map[a2][b2 - 1] == 0 && map[a1][b1 - 1] == 0 && map[a3][b3 - 1] == 0)
			return true;
		else return false;
	}
	bool right_moveable()
	{
		if (map[a1][b1 + 1] == 0 && map[a3][b3 + 1] == 0 && map[a0][b0 + 1] == 0 && map[a2][b2 + 1] == 0)
			return true;
		else return false;
	}
	bool shape_is_botton_adjacent()
	{
		if (is_block_adjacent(a3, b3))
			return true;
		else return false;
	}
};
//“——”形状类
class Heng :public Shape
{
public:
	Heng(int a_0 = 1, int a_1 = 1, int a_2 = 1, int a_3 = 1, int b_0 = 7, int b_1 = 8, int b_2 = 9, int b_3 = 10)
	{
		a0 = a_0, a1 = a_1, a2 = a_2, a3 = a_3, b0 = b_0, b1 = b_1, b2 = b_2, b3 = b_3;
	}
	void click(char ch)
	{
		switch (ch)
		{
		case'a':
		{
			if (laft_moveable() == true)
			{
				clean();
				b0--; b1--; b2--; b3--;
			}
			break;
		}
		case'd':
		{
			if (right_moveable() == true)
			{
				clean();
				b0++; b1++; b2++; b3++;
			}
			break;
		}
		case's':
		{
			if (fall_moveable() == true)
			{
				clean();
				a0++; a1++; a2++; a3++;
			}
			break;
		}
		}
	}
	void fall()
	{
		if (fall_moveable() == true)
		{
			clean();
			a0++; a1++; a2++; a3++;
		}
	}
	bool fall_moveable()
	{
		if (map[a0 + 1][b0] == 0 && map[a2 + 1][b2] == 0 && map[a1 + 1][b1] == 0 && map[a3 + 1][b3] == 0)
			return true;
		else return false;
	}
	bool laft_moveable()
	{
		if (map[a0][b0 - 1] == 0)
			return true;
		else return false;
	}
	bool right_moveable()
	{
		if (map[a3][b3 + 1] == 0)
			return true;
		else return false;
	}
	bool shape_is_botton_adjacent()//判断形状是否可以移动
	{
		if (is_block_adjacent(a0, b0) || is_block_adjacent(a1, b1) || is_block_adjacent(a2, b2) || is_block_adjacent(a3, b3))
			return true;
		else return false;
	}

};

//“Z”形状类
class Z :public Shape                   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
{
public:
	Z(int a_0 = 1, int a_1 = 1, int a_2 = 2, int a_3 = 2, int b_0 = 7, int b_1 = 8, int b_2 = 8, int b_3 = 9)
	{
		a0 = a_0, a1 = a_1, a2 = a_2, a3 = a_3, b0 = b_0, b1 = b_1, b2 = b_2, b3 = b_3;
	}
	void click(char ch)
	{
		switch (ch)
		{
		case'a':
		{
			if (laft_moveable() == true)
			{
				clean();
				b0--; b1--; b2--; b3--;
			}
			break;
		}
		case'd':
		{
			if (right_moveable() == true)
			{
				clean();
				b0++; b1++; b2++; b3++;
			}
			break;
		}
		case's':
		{
			if (fall_moveable() == true)
			{
				clean();
				a0++; a1++; a2++; a3++;
			}
			break;
		}
		}
	}
	void fall()
	{
		if (fall_moveable() == true)
		{
			clean();
			a0++; a1++; a2++; a3++;
		}
	}
	bool fall_moveable()
	{
		if (map[a0 + 1][b0] == 0 && map[a2 + 1][b2] == 0 && map[a3 + 1][b3] == 0)
			return true;
		else return false;
	}
	bool laft_moveable()
	{
		if (map[a0][b0 - 1] == 0 && map[a2][b2 - 1] == 0)
			return true;
		else return false;
	}
	bool right_moveable()
	{
		if (map[a3][b3 + 1] == 0 && map[a1][b1 + 1] == 0)
			return true;
		else return false;
	}
	bool shape_is_botton_adjacent()//判断形状是否可以移动
	{
		if (is_block_adjacent(a0, b0) || is_block_adjacent(a1, b1) || is_block_adjacent(a2, b2) || is_block_adjacent(a3, b3))
			return true;
		else return false;
	}
};

//“ZZ”形状类
class ZZ :public Shape                   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
{
public:
	ZZ(int a_0 = 1, int a_1 = 2, int a_2 = 2, int a_3 = 3, int b_0 = 9, int b_1 = 8, int b_2 = 9, int b_3 = 8)
	{
		a0 = a_0, a1 = a_1, a2 = a_2, a3 = a_3, b0 = b_0, b1 = b_1, b2 = b_2, b3 = b_3;
	}
	void click(char ch)
	{
		switch (ch)
		{
		case'a':
		{
			if (laft_moveable() == true)
			{
				clean();
				b0--; b1--; b2--; b3--;
			}
			break;
		}
		case'd':
		{
			if (right_moveable() == true)
			{
				clean();
				b0++; b1++; b2++; b3++;
			}
			break;
		}
		case's':
		{
			if (fall_moveable() == true)
			{
				clean();
				a0++; a1++; a2++; a3++;
			}
			break;
		}
		}
	}
	void fall()
	{
		if (fall_moveable() == true)
		{
			clean();
			a0++; a1++; a2++; a3++;
		}
	}
	bool fall_moveable()
	{
		if (map[a2 + 1][b2] == 0 && map[a3 + 1][b3] == 0)
			return true;
		else return false;
	}
	bool laft_moveable()
	{
		if (map[a1][b1 - 1] == 0 && map[a3][b3 - 1] == 0)
			return true;
		else return false;
	}
	bool right_moveable()
	{
		if (map[a0][b0 + 1] == 0 && map[a2][b2 + 1] == 0)
			return true;
		else return false;
	}
	bool shape_is_botton_adjacent()//判断形状是否可以移动
	{
		if (is_block_adjacent(a0, b0) || is_block_adjacent(a1, b1) || is_block_adjacent(a2, b2) || is_block_adjacent(a3, b3))
			return true;
		else return false;
	}
};
//游戏类
class Game
{
public:

	void start()
	{
	lable:
		srand((unsigned)time(NULL));
		int random = rand() % 5;
		Shape* pt;
		Tian tian;
		Shu shu;
		Heng heng;
		Z z;
		ZZ zz;

		switch (random)
		{
		case 0:pt = &tian; break;
		case 1:pt = &shu; break;
		case 2:pt = &heng; break;
		case 3:pt = &z; break;
		case 4:pt = &zz; break;
		}
		while (1)
		{

			pt->init();
			drawMap();
			cout << "Your score is " << endl;
			cout << "---------" << endl;
			cout << "        " << endl;
			cout << "    " << n << "   " << endl;
			cout << "        " << endl;
			cout << "---------" << endl;



			if (kbhit())
				ch = getche();
			if (ch == 'w')
			{
				pt->clean();
				switch (random)
				{
				case 0:break;
				case 1:
					if (heng_shu_rotateable(pt->a1, pt->b1))
					{
						Heng heng2(pt->a1, pt->a1, pt->a1, pt->a1, pt->b1 - 1, pt->b1, pt->b1 + 1, pt->b1 + 2);
						pt = &heng2;
						pt->init();
						random = 2;
					}
					break;
				case 2:
					if (heng_shu_rotateable(pt->a1, pt->b1))
					{
						Shu shu2(pt->a1 - 1, pt->a1, pt->a1 + 1, pt->a1 + 2, pt->b1, pt->b1, pt->b1, pt->b1);
						pt = &shu2;
						pt->init();
						random = 1;
					}
					break;
				case 3:
					if (z_rotateable(pt->a0, pt->a1, pt->a2, pt->a3, pt->b0, pt->b1, pt->b2, pt->b3))  /////////////////////////////////////////////////////////////////////////////////////////////
					{
						ZZ zz2(pt->a0 - 1, pt->a1, pt->a2 - 1, pt->a3, pt->b0 + 1, pt->b1 - 1, pt->b2, pt->b3 - 2);
						pt = &zz2;
						pt->init();
						random = 4;
					}
					break;
				case 4:
					if (z_rotateable(pt->a0, pt->a1, pt->a2, pt->a3, pt->b0, pt->b1, pt->b2, pt->b3))
					{
						Z z2(pt->a0 + 1, pt->a1, pt->a2 + 1, pt->a3, pt->b0 - 1, pt->b1 + 1, pt->b2, pt->b3 + 2);
						pt = &z2;
						pt->init();
						random = 3;
					}
					break;

				}
			}
			else
				pt->click(ch);

			pt->fall();
			Sleep(400);
			system("cls");
			ch = '0';

			if (pt->shape_is_botton_adjacent())
			{
				for (int a = 0; a < 30; a++)
				{
					if (is_full(a))
					{
						movedown(a);
						n++;
					}
				}
				goto lable;

			}
			system("cls");
			ch = '0';
		}
	}


	//判断是否为满行
	bool is_full(int a)
	{
		int j = 0;
		for (int i = 1; i < 17; i++)
		{
			if (map[a][i] == 2)j++;
		}
		if (j == 16)return true;
		else return false;
	}
	//下移
	int movedown(int a)
	{
		int score = 0;
		for (int i = a; i > 1; i--)
			for (int j = 1; j < 17; j++)
				map[i][j] = map[i - 1][j];
		for (int i2 = 1; i2 < 17; i2++)
			map[1][i2] = 0;

		score++;
		return score;

	}
	//判断横竖是否可以旋转
	bool heng_shu_rotateable(int a, int b)
	{
		int x = 0;
		for (int i = a - 1; i <= a + 2; i++)
		{
			for (int j = b - 1; j <= b + 2; j++)
			{
				if (map[i][j] != 0)x++;
			}
		}
		if (x == 0)return true;
		else return false;
	}
	//判断z型的b是否可以旋转
	bool z_rotateable(int a, int b, int c, int d, int e, int f, int g, int h)     ///////////////////////////////////////////////////////////////////
	{
		int x = 0;
		for (int i = c - 1; i < c + 2; i++)
		{
			for (int j = g - 1; j < g + 2; j++)
			{
				if (map[i][j] != 0)x++;
			}
		}
		if (x == 0) return true;
		else return false;
	}
};
int main()
{

	Game game;
	game.start();
	return 0;
}