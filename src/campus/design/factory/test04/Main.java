package campus.design.factory.test04;

public class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        Bind bind = new Apple();
        bind.use();

        bind = new Samsung();
        bind.use();

        System.out.println("=====================");
        PhoneFactory phoneFactory = new PhoneFactory();
        bind = phoneFactory.create();
        bind.use();

        bind = new PrintFactory().create();
        bind.use();




        //실습
        bind = new RefrigeratorFactory().create();
        bind.use();
    }
}
