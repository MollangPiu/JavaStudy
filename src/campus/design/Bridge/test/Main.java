package campus.design.bridge.test;

public class Main {
    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction(new ConcreteImplementor());
        abstraction.display();
        abstraction.execute();
    }
}
