package campus.design.bridge.test02;

public class Abstraction {

    private Service service;

    public Abstraction(Service service) {
        this.service = service;
    }

    public void disp() {
        System.out.println("Abstraction display");

        service.use();
        service.execute();
    }
}
