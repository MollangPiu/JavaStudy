package campus.design.factory.test04;

public class RefrigeratorFactory {
    public Samsung create() {
        System.out.println("냉장고");
        return new Samsung();
    }
}
