package campus.design.adapter.ro;

public class ClientMain {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);

        target.givePlugConfig();
    }
}
