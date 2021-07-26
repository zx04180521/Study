/*
日期：2020-7-13；
目的：利用递归求n项和累加。
*/
#include<stdio.h>
int main(void)
{
	int sum(int val);
	int val;
	printf("请输入所要累加的数字：");
	scanf_s("%d", &val);
	int a = sum(val);
	printf("sum val = %d", a);
	return 0;
}
int sum(int val)
{
	int f;

	if (val == 1)
		f = 1;
	else
		f = sum(val - 1) + val;
	return(f);
}