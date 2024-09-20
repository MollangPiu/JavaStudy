package campus.design.bridge.test;

public class Main {
    public static void main(String[] args) {
        ConcreteImplementor implementor = new ConcreteImplementor();
        Abstraction abstraction = new Abstraction(implementor);
        abstraction.setNum(100);
        abstraction.display();

        RefinedAbstraction abstraction2 = new RefinedAbstraction(implementor);
        abstraction2.display();
    }
}
