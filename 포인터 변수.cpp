//#include <stdio.h>
//
//
//int main()
//{
//	//���� ���ϱ�
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
//	printf("���� : %d", d);
//	printf("\n�ѤѤ�\n");
//	printf("�и� : %d", c);
//
//	printf("\n\n������ ���ϸ� : %d�̴�.\n\n", div);
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

	printf("swap �� : %d %d\n", a, b);

	swap(&a, &b);

	printf("swap �� : %d %d\n", a, b);

	return 0;
}

