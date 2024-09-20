package campus.design.builder.test04;

public class Main {

    public static void main(String[] args) {
        StudentVO studentVO = new StudentVO();
        studentVO.setName("슈퍼맨");
        studentVO.setKorScore(100);

        //일반적인 생성자 방법은, 만든 사람 외에는 막상 사용하기가 어렵다.
        StudentVO studentVO1 = new StudentVO("배트맨", 80);
        System.out.println(studentVO1.getEngScore());

        StudentVO.Builder builder = new StudentVO.Builder();
        StudentVO studentVO2 = new StudentVO.Builder()
                .setName("슈퍼맨")
                .setKorScore(100)
                .setEngScore(100)
                .setMathScore(100)
                .build();

        System.out.println(studentVO2.getName());
        System.out.println(studentVO2.getKorScore());
        System.out.println(studentVO2.getEngScore());
        System.out.println(studentVO2.getMathScore());
    }
}
