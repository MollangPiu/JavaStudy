package campus.design.builder.test02;

class Student {

    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;

    public Student(Builder builder) {
        this.name = builder.name;
        this.korScore = builder.korScore;
        this.engScore = builder.engScore;
        this.mathScore = builder.mathScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", korScore=" + korScore +
                ", engScore=" + engScore +
                ", mathScore=" + mathScore +
                '}';
    }

    //정적 멤버 클레스
    public static class Builder {
        private String name;
        private int korScore;
        private int engScore;
        private int mathScore;
        public Builder(String name) { this.name = name; }
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

        public Student build() {
            return new Student(this);
        }
    }

}

class Main {
    public static void main(String[] args) {
        Student stu01 = new Student.Builder("슈퍼맨")
                .setKorScore(100)
                .setEngScore(100)
                .setMathScore(100)
                .build();

        Student stu02 = new Student.Builder("배트맨")
                .setKorScore(90)
                        .setEngScore(90)
                                .build();

        System.out.println(stu01.toString());
        System.out.println(stu02.toString());
    }
}