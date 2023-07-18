package Test;


public class SooJeBee01 {


    public static void main(String[] args) {
        MemberDto memberDto = new MemberDto("홍길동", 100, 50);
        memberDto.name = "오창혁";
        System.out.println(memberDto.getName());
    }
}


//DTO, VO
class MemberDto {

    MemberDto() {

    }
    MemberDto(String name, int koreanScore, int mathScore) {
        this.name = name;
        this.koreanScore = koreanScore;
        this.mathScore = mathScore;
    }

    String name;   //이름
    int mathScore;  //수학점수
    int koreanScore; //국어점수

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    public void setKoreanScore(int koreanScore) {
        this.koreanScore = koreanScore;
    }
}
