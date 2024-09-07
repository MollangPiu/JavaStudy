package campus.design.factory.pro;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory factory1 = new ConcreteFactory();
        Product id1 = factory1.create("Hello World");

        AbsFactory factory2 = new AbsFactory();
        Product id2 = factory2.create("Message");

        id1.use();
        id2.use();
    }
}
