package campus.exam;

class Student {
    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;

    public Student(String name, int korScore, int engScore, int mathScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }
    public int getKorScore() {
        return korScore;
    }
    public int getEngScore() {
        return engScore;
    }
    public int getMathScore() {
        return mathScore;
    }
}

class Manager {
    Student student;

    public Manager(Student student) {
        this.student = student;
    }

    public void dividingLine() {
        System.out.println("===================================");
    }
    public void line(String systemOutPrint) {
        System.out.println(systemOutPrint);
    }
    public void line(int systemOutPrint) {
        System.out.println(systemOutPrint);
    }

    public void getScore() {
        line(student.getName());
        line(student.getKorScore());
        line(student.getEngScore());
        line(student.getMathScore());
    }

    public int getTotal() {
        return student.getMathScore()+student.getEngScore()+student.getKorScore();
    }
    public float getAvg() {
        return (float)getTotal()/3;
    }
}

public class MethodExMain {
    public static void main(String[] args) {
        Manager manager = new Manager(new Student("짱구", 100, 100, 80));

        manager.getScore(); //입력된 정보
        manager.dividingLine();
        manager.getTotal(); //총점
        System.out.println(manager.getTotal());
        manager.dividingLine();
        System.out.printf(String.format("%.2f", manager.getAvg()));
    }
}
