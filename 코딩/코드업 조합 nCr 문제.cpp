#include <stdio.h>


int main()
{
	//���� ���ϱ�

	int n, r, d, c, div;

	scanf("%d %d", &n, &r);

	for (int i = 0; i < r; i++)
	{
		d = n * (n - i);
		
		c = r * (r - i);
		div = d / c;
	}
	printf("���� : %d", d);
	printf("\n�ѤѤ�\n");
	printf("�и� : %d", c);

	printf("\n\n������ ���ϸ� : %d�̴�.\n\n", div);
}


