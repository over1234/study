#include <stdio.h>

int swapStudent(int* left, int* right)
{
	int temp;
	if (*left > *right)
	{
		temp = *left;
		*left = *right;
		*right = temp;
	}
}

int main()
{
	int left;
	int right;
	scanf("%d", &left);
	scanf("%d", &right);

	swapStudent(&left, &right);

	printf("���� : %d, ������ : %d", left, right);

	return 0;
}