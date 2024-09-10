package campus.design.Facade.report;

public class Facade {
    private SubsystemA subA = new SubsystemA();
    private SubsystemB subB = new SubsystemB();

    public void operation() {
        System.out.println(subA.operationA());
        System.out.println(subB.operationB());
    }
}
