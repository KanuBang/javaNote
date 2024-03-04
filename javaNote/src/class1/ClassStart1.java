package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "Elon musk";
        student2.age = 40;
        student2.grade = 100;

        System.out.println("이름: " + student1.name  + " 나이: " + student1.age +  " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name  + " 나이: " + student2.age +  " 성적: " + student2.grade);
    }
}
