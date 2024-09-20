package campus.design.builder.test04;

public class StudentVO {
    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;

    public StudentVO() { }

    public StudentVO(String name) {
        this.name = name;
    }
    public StudentVO(String name, int korScore) {
        this.name = name;
        this.korScore = korScore;
    }

    public StudentVO(Builder builder) {
        this.name = builder.name;
        this.korScore = builder.korScore;
        this.engScore = builder.engScore;
        this.mathScore = builder.mathScore;
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

    public static class Builder {
        private String name;
        private int korScore;
        private int engScore;
        private int mathScore;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setKorScore(int korScore) {
            this.korScore = korScore;
            return this;
        }

        public Builder setEngScore(int engScore) {
            this.engScore = engScore;
            return this;
        }

        public Builder setMathScore(int mathScore) {
            this.mathScore = mathScore;
            return this;
        }

        public StudentVO build() {
            return new StudentVO(this);
        }
    }
}
