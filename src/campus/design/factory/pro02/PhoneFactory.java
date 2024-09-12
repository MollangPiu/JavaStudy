package campus.design.factory.pro02;

public class PhoneFactory implements Factory{
    @Override
    public Create createUser(String name) {
        System.out.println("SmartPhone");
        return new CreateService(name);
    }
}
