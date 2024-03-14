package campus.student;


/**
 * 학생 데이터 저장 / 불러오기
 */
class ScoreStudent {
    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;

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
}

class StudentList {

    ScoreStudent scoreStudentList [] = new ScoreStudent[10];

    public ScoreStudent getStudentIndex(int index) {
        return scoreStudentList [index];
    }
}

public class StudentMain {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();

        for(int i =0; i< studentList.scoreStudentList.length; i++) {
            System.out.println("배열의 인덱스: "+i);
            studentList.scoreStudentList[i] = new ScoreStudent();

            //점수를 10명에 대한 정보를 3개씩 넣기 귀찮아서요.
            int random = (int) (Math.random()*101);
            studentList.scoreStudentList[i].setKorScore(random);
            random = (int) (Math.random()*101);
            studentList.scoreStudentList[i].setEngScore(random);
            random = (int) (Math.random()*101);
            studentList.scoreStudentList[i].setMathScore(random);

        }

        for(int i =0; i< studentList.scoreStudentList.length; i++) {
            ScoreStudent student = studentList.getStudentIndex(i);
            System.out.println("국어점수: "+student.getKorScore());
            System.out.println("영어점수: "+student.getEngScore());
            System.out.println("수학점수: "+student.getMathScore());
            System.out.println("======================================");
        }


    }
}
