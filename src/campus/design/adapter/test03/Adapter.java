package campus.design.adapter.test03;

public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter() { }
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void use() {
        System.out.println("use");
    }

    @Override
    public void plus() {
        adaptee.prov();
        adaptee.test("use");
        use();
    }
}
