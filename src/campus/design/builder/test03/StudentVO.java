package campus.design.builder.test03;

public class StudentVO {
    private String name;
    private int score;

    public StudentVO(Build build) {
        this.name = build.getName();
        this.score = build.getScore();
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public static class Build {
        private String name;
        private int score;

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public Build setName(String name) {
            this.name = name;
            return this;
        }

        public Build setScore(int score) {
            this.score = score;
            return this;
        }

        public StudentVO build() {
            return new StudentVO(this);
        }
    }
}
