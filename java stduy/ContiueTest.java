package java_study_12;

public class ContiueTest {
    public static void main(String[] args) {
        // 1부터 숫자를 더해서 100이 넘는 순간의 그 숫자와 합을 출력하는 프로그램
        int count = 1;

        for(; count <= 100; count++)
        {
            if(count % 3 == 0)
            {
                System.out.println(count);
            }
        }
    }
}
