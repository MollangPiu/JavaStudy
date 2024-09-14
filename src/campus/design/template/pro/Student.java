package campus.design.template.pro;

public class Student {
    private String name;
    private int score;
    private int point;

    public Student(String name) {
        this.name = name;
        this.score = 100;
        this.point = 10;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getName() {
        return this.name;
    }

    public void give(Student student) {
        this.score-=this.point;
        student.receive(this, point);
        System.out.println(this.getName()+"이(가) 포인트를 건넵니다. / 남은 포인트: "+this.score);
    }
    public void receive(Student student, int point) {
        this.score += point;
        System.out.println(student.getName()+"이(가) 포인트를 받았습니다. / 남은 포인트: "+(this.score));
    }
}
