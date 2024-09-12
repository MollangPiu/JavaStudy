package campus.design.builder.test03;

public class Main {
    public static void main(String[] args) {
        StudentVO studentVO = new StudentVO.Build()
                .setName("슈퍼맨")
                .setScore(100)
                .build();

        System.out.println("이름: "+studentVO.getName());
        System.out.println("점수: "+studentVO.getScore());
    }
}
