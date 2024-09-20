package campus.design.prototype.test02;


public class Manager {

    private StudentVO studentVO;

    public void setStudentVO(StudentVO studentVO) {
        this.studentVO = studentVO;
        this.studentVO.setKorScore(100);
    }

    public StudentVO getStudentVO() {
        return this.studentVO;
    }

}
