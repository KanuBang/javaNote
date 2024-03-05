package ref;

public class Student {
    private String name;
    private String major;
    private int grade;

    public Student(String name, String major, int grade) {
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getGrade() {
        return grade;
    }
}
