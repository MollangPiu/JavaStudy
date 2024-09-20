package campus.design.prototype.test02;

public class Main {

    public static void main(String[] args) {
        StudentVO studentVO = new StudentVO();
        studentVO.setName("슈퍼맨");
        studentVO.setKorScore(90);
        studentVO.setMathScore(90);
        studentVO.setEngScore(90);

        Manager manager = new Manager();
        manager.setStudentVO(studentVO);

        System.out.println(studentVO.getKorScore());
    }
}
