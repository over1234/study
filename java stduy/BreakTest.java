package java_study_12;

public class BreakTest {
    public static void main(String[] args)
    {
        //1부터 숫자를 더해서 100이 넘는 순간의 그 숫자와 합을 출력하는 프로그램
        int sum = 0;
        int num = 1;

        for(; ; num++)
        {
            if(sum > 100)
            {
                break;
            }
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
