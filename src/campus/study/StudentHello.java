package campus.study;

class Name {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Subject {
    int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
public class StudentHello {

    Name name;
    Subject kor;
    Subject eng;
    Subject mat;
    int total;
    int avg;

    public StudentHello() {
        name = new Name();
        kor = new Subject();
        eng = new Subject();
        mat = new Subject();
    }

    public StudentHello(Name name, Subject kor, Subject eng, Subject mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Subject getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor.setScore(kor);
    }

    public Subject getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng.setScore(eng);
    }

    public Subject getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat.setScore(mat);
    }

    public static void main(String[] args) {

    }
}
