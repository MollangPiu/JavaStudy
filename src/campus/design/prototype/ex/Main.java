package campus.design.prototype.ex;

public class Main {

    public static void main(String[] args) {
        StudentVO studentVO = new StudentVO();
        studentVO.setName("슈퍼맨");
        studentVO.setKorScore(100);
        studentVO.setEngScore(100);
        studentVO.setMathScore(100);

        try {
            Manager manager = new Manager();
            manager.setStudentVO(studentVO);
            manager.getStudentVO().setMathScore(50);

            System.out.println(studentVO.getMathScore());
            System.out.println(manager.getStudentVO().getMathScore());

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
