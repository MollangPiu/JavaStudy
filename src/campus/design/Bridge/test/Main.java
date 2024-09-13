package campus.design.bridge.test;

public class Main {
    public static void main(String[] args) {
        ConcreteImplementor implementor = new ConcreteImplementor();
        Abstraction abstraction = new Abstraction(implementor);
        abstraction.setNum(100);
        abstraction.display();

        ConcreteAbstraction abstraction2 = new ConcreteAbstraction(implementor);
        abstraction2.display();
    }
}
