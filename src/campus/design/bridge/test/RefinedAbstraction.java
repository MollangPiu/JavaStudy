package campus.design.bridge.test;

public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void execute(int num) {
        super.display();
    }
}
