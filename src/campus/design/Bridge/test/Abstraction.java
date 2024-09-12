package campus.design.bridge.test;

public class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void display() {
        System.out.println("Abstraction");
        implementor.print();
    }

    public int execute() {
        System.out.println("Abstraction execute");
        implementor.use();
        return 10;
    }
}
