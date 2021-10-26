package ch14;

public class StudentTest {

    public static void main(String[] args)
    {
        Student choi = new Student(1117, "choi");
        Student kim = new Student(1217, "kim");

        choi.addSubjcet("OS", 100);
        choi.addSubjcet("수학", 100);

        kim.addSubjcet("OS", 90);
        kim.addSubjcet("수학", 80);
        kim.addSubjcet("영어", 95);

        choi.showInfo();
        kim.showInfo();
    }
    
}
