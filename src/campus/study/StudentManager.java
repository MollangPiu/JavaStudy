package campus.study;

class StudentScore {
    private String name;        //학생 이름
    private int korScore;       //국어 점수
    private int mathScore;      //수학 점수
    private int engScore;       //영어 점수

    public StudentScore() {
        korScore = 0;
        mathScore = 0;
        engScore = 0;
    }

    public StudentScore(int korScore, int engScore, int mathScore) {
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    public void setKorScore(int korScore) {
        this.korScore = korScore;
    }

    //접근제어자 리턴자료타입
    public int getKorScore() {
        return this.korScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }
    public int getEngScore() {
        return engScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }
    public int getMathScore() {
        return this.mathScore;
    }


    public int getTotal() {
        return getMathScore() + getEngScore() + getKorScore();
    }
}

class StudentManager {

    public int random() {

        return (int) (Math.random()*101);
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        StudentScore[] scoreList = new StudentScore[5];

        int i=0;
        for(; i < scoreList.length; i++) {
            scoreList[i] = new StudentScore();
            scoreList[i].setKorScore(studentManager.random());
            scoreList[i].setMathScore(studentManager.random());
            scoreList[i].setEngScore(studentManager.random());
        }

        for(i = 0; i < scoreList.length; i++) {
            System.out.println("국어점수: "+scoreList[i].getKorScore());
            System.out.println("영어점수: "+scoreList[i].getEngScore());
            System.out.println("수학점수: "+scoreList[i].getMathScore());
            System.out.println("총점: "+scoreList[i].getTotal());
            System.out.println("===========================================");
        }

    }
}
