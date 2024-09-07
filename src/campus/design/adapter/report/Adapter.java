package campus.design.adapter.report;

public class Adapter implements Target{

    private Adaptee adaptee;
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void plugIn(String plugType) {
        adaptee.prov("Adater using: "+plugType);
    }
}
