package campus.design.factory.test02_before;

public class StudentProduct implements Product {

    String name;

    public StudentProduct(String name) {
        this.name = name;
    }
    @Override
    public void use() {
        System.out.println(name+"의 card 사용");
    }
}
