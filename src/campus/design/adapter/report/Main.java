package campus.design.adapter.report;

public class Main {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        Client client = new Client(target);
        client.powerOn();
    }
}
