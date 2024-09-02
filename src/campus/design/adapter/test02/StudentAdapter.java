package campus.design.adapter.test02;

public class StudentAdapter implements Action{
    private Student student;

    public StudentAdapter(Student student) {
        this.student = student;
    }

    @Override
    public void getName() {
        System.out.println("학생의이름: "+student.getName());
    }

    @Override
    public void getScore() {
        System.out.printf("국어점수: %d",student.getKorScore());
        System.out.printf("\t영어점수: %d",student.getEngScore());
        System.out.printf("\t수학점수: %d",student.getMathScore());
        System.out.printf("\t총점: %d\n",(student.getKorScore()+ student.getEngScore()+student.getMathScore()));
    }

}
