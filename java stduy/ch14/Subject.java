package ch14;

public class Subject {
    private String subjectName;
    private int subjectScore;

    public Subject(String subjectName, int subjectScore) {
        this.setSubjectName(subjectName);
        this.setSubjectScore(subjectScore);
    }

    public int getSubjectScore() {
        return subjectScore;
    }

    public void setSubjectScore(int subjectScore) {
        this.subjectScore = subjectScore;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
