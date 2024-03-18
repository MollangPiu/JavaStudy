package campus.study;


class AAA {
    
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void disp() {
        System.out.println("디스플레이");
    }
}
public class Abs extends AAA{

    public static void main(String[] args) {
        Abs abs =new Abs();


        abs.setName("짱구");
        abs.setScore(90);
        System.out.println(abs.getName());
        System.out.println(abs.getScore());

    }
}
