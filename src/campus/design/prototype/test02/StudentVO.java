package campus.design.prototype.test02;

public class StudentVO implements Cloneable{
    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorScore() {
        return korScore;
    }

    public void setKorScore(int korScore) {
        this.korScore = korScore;
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

    @Override
    public String toString() {
        return "StudentVO{" +
                "name='" + name + '\'' +
                ", korScore=" + korScore +
                ", engScore=" + engScore +
                ", mathScore=" + mathScore +
                '}';
    }
}
