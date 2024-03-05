package ref;

import ref.Student;

// 참조형 + 메서드 호출로 객체의 생성과 출력 작업을 메서드 단위로 나눌 수 있다.
public class Test1 {
    public static void main(String[] args) {
        Student student1 = createStudent("알트만", "컴퓨터공학과", 4);
        Student student2 = createStudent("저커버그", "컴퓨터공학과", 2);
        printStudent(student1);
        printStudent(student2);
    }

    private static Student createStudent(String name, String major, int grade) {
        return new Student(name, major, grade);
    }

    private static void printStudent(Student student) {
        System.out.printf("이름: %s, 학과: %s, 학년 %d\n", student.getName(), student.getMajor(), student.getGrade());
    }
}
