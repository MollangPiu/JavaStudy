package campus.design.factory.test02_after;

public class StudentCard implements Card {

    String name;

    public StudentCard(String name) {
        this.name = name;
    }
    @Override
    public void use() {
        System.out.println(name+"의 card 사용");
    }

    public static class Factory {
        public static StudentCard create(String name) {
            return new StudentCard(name);
        }
    }
}
