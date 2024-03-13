package campus.study;


class Score {
    private int korScore;
    private int engScore;
    private int mathScore;

    public Score() {
        this.korScore = 0;
        this.mathScore = 0;
        this.engScore = 0;
    }

    public Score(int korScore, int engScore, int mathScore) {
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
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
}
public class ScoreMain {

    public static void main(String[] args) {
        Score score = new Score();
        score.setMathScore(100);
        score.setEngScore(90);
        score.setKorScore(95);
        System.out.println(score.getKorScore()+score.getMathScore()+score.getEngScore());

        Score score1 = new Score();
        score1.setMathScore(100);
        score1.setEngScore(90);
        score1.setKorScore(95);
        System.out.println(score1.getKorScore()+score1.getMathScore()+score1.getEngScore());

        Score score2 = new Score(90, 80, 70);
        System.out.println(score2.getKorScore()+score2.getMathScore()+score2.getEngScore());
    }
}
