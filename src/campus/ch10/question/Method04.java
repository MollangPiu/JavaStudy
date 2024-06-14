package campus.ch10.question;

import java.util.Scanner;

class Method04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("- 이름 -");
        String name = sc.next();
        System.out.println("- 국어점수 -");
        int korScore = sc.nextInt();
        System.out.println("- 영어점수 -");
        int engScore = sc.nextInt();
        System.out.println("- 수학점수 -");
        int mathScore = sc.nextInt();

        Student04 student04 = new Student04();
        student04.setName(name);
        student04.setKoreScore(korScore);
        student04.setEngScore(engScore);
        student04.setMathScore(mathScore);

        System.out.println("이름: "+student04.getName());
        System.out.println("국어점수: "+student04.getKoreScore());
        System.out.println("영어점수: "+student04.getEngScore());
        System.out.println("수학점수: "+student04.getMathScore());
    }
}

class Student04 {

    private String name;
    private int koreScore;
    private int engScore;
    private int mathScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKoreScore() {
        return koreScore;
    }

    public void setKoreScore(int koreScore) {
        this.koreScore = koreScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }
}
