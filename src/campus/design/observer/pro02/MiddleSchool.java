package campus.design.observer.pro02;

public class MiddleSchool implements Student{

    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;

    public MiddleSchool(String name, int korScore, int engScore, int mathScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    @Override
    public void info() {
        System.out.printf("이름: %s\t",name);
        System.out.printf("국어: %d\t\t",korScore);
        System.out.printf("영어: %d\t\t",engScore);
        System.out.printf("수학: %d\t\t",mathScore);
        System.out.println("총합: "+(korScore+mathScore+engScore));
    }
}
