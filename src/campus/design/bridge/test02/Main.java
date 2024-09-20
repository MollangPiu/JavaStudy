package campus.design.bridge.test02;



public class Main {

    public static void main(String[] args) {
        Service service = new ServiceImpl();
        service.use();
        service.execute();

        System.out.println("==================");

        Abstraction abstraction = new Abstraction(service);
        abstraction.disp();
    }
}
