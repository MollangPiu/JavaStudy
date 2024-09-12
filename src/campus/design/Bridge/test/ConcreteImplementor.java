package campus.design.bridge.test;

public class ConcreteImplementor implements Implementor{
    @Override
    public void print() {
        System.out.println("ConcreteImplementor print");
    }

    @Override
    public void use() {
        System.out.println("ConcreteImplementor use");
    }
}
