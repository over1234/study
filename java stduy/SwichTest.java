package java_study_10;

public class SwichTest {
    //월별 총 일수를 출력하는 프로그램
    public static void main(String[] args)
    {
        int month = 9;
    int day;

    switch (month) {
        case 1 case 3 case 5 case 7 case 8 case 10 case 12:
            day = 31;
            break;

        case 1:
            day = 28;
            break;

        case 4 case 6 case 9 case 11:
            day = 30;
            break;

        default:
            System.out.println("입력하신 월이 잘못되었습니다.");
            break;
    }
    System.out.println(month + "월의 총 입수는 " + day + "입니다.");
    }
}
