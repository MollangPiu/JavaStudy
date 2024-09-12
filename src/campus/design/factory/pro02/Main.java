package campus.design.factory.pro02;

public class Main {
    public static void main(String[] args) {
        Factory factory = new ComputerFactory();
        Create computer = factory.createUser("window");

        factory = new PhoneFactory();
        Create phone = factory.createUser("korea");

        computer.createUser();
        phone.createUser();

    }
}
