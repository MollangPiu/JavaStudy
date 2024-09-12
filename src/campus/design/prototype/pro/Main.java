package campus.design.prototype.pro;

public class Main {

    public static void main(String[] args) {
        try {
            StudentVO stu1 = new StudentVO();
            stu1.setName("슈퍼맨");
            stu1.setKorScore(100);
            stu1.setEngScore(100);
            stu1.setMathScore(100);

            StudentVO stu2 = (StudentVO) stu1.clone();
            stu2.setName("배트맨");

            System.out.println(stu1.toString());
            System.out.println(stu2.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
