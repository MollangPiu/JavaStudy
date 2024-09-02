package campus.design.factory.test02_after;

public class StudentProduct implements Product {

    String name;

    public StudentProduct(String name) {
        this.name = name;
    }
    @Override
    public void use() {
        System.out.println(name+"의 card 사용");
    }

    public static class Factory {
        public static StudentProduct create(String name) {
            return new StudentProduct(name);
        }
    }
}
