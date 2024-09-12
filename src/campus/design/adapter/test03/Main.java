package campus.design.adapter.test03;

public class Main {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.use();

        Adaptee adaptee = new Adaptee();
        Target target2 = new Adapter(adaptee);
        target2.use();
        target2.plus();

    }
}
