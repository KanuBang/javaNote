package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        Student[] students = new Student[2];

        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        students[0] = student1;
        students[1] = student2;

        for (Student stud: students) {
            System.out.printf("이름: %s, 나이: %s, 성적: %s\n", stud.name, stud.age, stud.grade);
        }
    }
}
