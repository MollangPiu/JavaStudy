package campus.design.bridge.test;

public class ConcreteAbstraction extends Abstraction{
    public ConcreteAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void execute(int num) {
        super.display();
    }
}
