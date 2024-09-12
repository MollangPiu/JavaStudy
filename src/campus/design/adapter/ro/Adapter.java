package campus.design.adapter.ro;

public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void givePlugConfig() {
        adaptee.prov();
        System.out.println("Adapter use");
    }
}
