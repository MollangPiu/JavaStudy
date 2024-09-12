package campus.design.factory.pro02;

public class ComputerFactory implements Factory{


    @Override
    public Create createUser(String name) {
        System.out.println("computer");
        return new CreateService(name);
    }
}
