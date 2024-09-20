package campus.design.prototype.ex;

public class Manager {

    private StudentVO studentVO;

    public void setStudentVO(StudentVO studentVO) throws CloneNotSupportedException{
        this.studentVO = (StudentVO) studentVO.clone();
    }

    public  StudentVO getStudentVO() {
        return this.studentVO;
    }

}
