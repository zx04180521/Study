#include<stdio.h>
int main()
{
	int a = 7;
	int b = 8;
	int c = 55;
	int num1 = max(a, b);
	int num2 = max(num1, c);
	printf("%d", num2);
	return 0;

}
int max(int n, int m)
{
	int da;
	if (n > m) {
		da = n;
	}
	else {
		da = m;
	}
	return da;
}










