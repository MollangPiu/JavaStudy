package campus.study;

class Student {

    //필드
    //this;
    int korScore;
    
    //메소드
    int getScore() {
        return korScore;
    }

    int getScore(int score) {

        return korScore+score;
    }
}

public class StudentMain {

    public static void main(String[] args) {
        Student student = new Student();

        student.korScore = 100;

        int score = student.getScore();
        System.out.println(score);

        int overScore = student.getScore(50);
        System.out.println(overScore);
    }
}
