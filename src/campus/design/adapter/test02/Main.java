package campus.design.adapter.test02;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("슈퍼맨");
        student.setKorScore(100);
        student.setEngScore(100);
        student.setMathScore(100);
        StudentAdapter stu01 = new StudentAdapter(student);

        stu01.getName();
        stu01.getScore();
    }
}
