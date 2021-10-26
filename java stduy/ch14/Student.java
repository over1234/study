package ch14;

import java.util.ArrayList;

public class Student {

    public Student(int number, String name)
    {
        this.name = name;
        this.number = number;
        subjects = new ArrayList<Subject>();
    }

    public void addSubjcet(String subjectName, int subjectScore) {
        Subject subject = new Subject(subjectName, subjectScore);
        subjects.add(subject);
    }

    private String name;
    private int number;
    private ArrayList<Subject> subjects;

    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void showInfo() {
        int sum = 0;
       for(Subject s : subjects) {
           System.out.println(name + "학생의 " + s.getSubjectName() + "의 성적은 " + s.getSubjectScore() + "입니다");
           sum += s.getSubjectScore();
       }
       System.out.println("총 점은" + sum + "입니다.");
    }
}
