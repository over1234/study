#include "stdio.h"
 
int main()
{
    int matrix[100][100] = {};  //[세로][가로]
    
    int h,w,n,l,d,x,y;
    
    scanf("%d %d",&h,&w); //세로,가로
    scanf("%d",&n);       // 놓을 수 있는 막대의 개수
    
    for(int i = 1; i <= n; i++){
        scanf("%d %d %d %d",&l,&d,&x,&y); //길이 방향 좌표 , (d:가로는 0, 세로는 1)
        if(d == 0){
            for(int j = 0; j<l; j++){
                matrix[x][y+j] = 1;
            }
        }
        else{
            for(int j = 0; j<l; j++){
                matrix[x+j][y] = 1;
            }
        }
    }
    
    for (int i = 1; i <= h; i++) //한 줄(위에서 아래로) 씩
    {
        for (int j = 1; j <= w; j++) //한 열(왼쪽에서 오른쪽으로) 씩
        {
            printf("%d ", matrix[i][j]); //값 출력
        }
        printf("\n"); //줄 바꾸기
    }
    
    return 0;
}
