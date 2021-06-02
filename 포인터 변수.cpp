//#include <stdio.h>
//
//
//int main()
//{
//	//순열 구하기
//
//	int n, r, d, c, div;
//
//	scanf("%d %d", &n, &r);
//
//	for (int i = 0; i < r; i++)
//	{
//		d = n * (n - i);
//		
//		c = r * (r - i);
//		div = d / c;
//	}
//	printf("분자 : %d", d);
//	printf("\nㅡㅡㅡ\n");
//	printf("분모 : %d", c);
//
//	printf("\n\n조합을 구하면 : %d이다.\n\n", div);
//}

#include <stdio.h>

void swap(int *a, int *b)
{
	int temp;

	temp = *a;
	*a = *b;
	*b = temp;
}

int main()
{
	int a, b;

	a = 10;
	b = 20;

	printf("swap 전 : %d %d\n", a, b);

	swap(&a, &b);

	printf("swap 후 : %d %d\n", a, b);

	return 0;
}

