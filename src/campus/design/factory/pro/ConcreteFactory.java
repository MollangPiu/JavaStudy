package campus.design.factory.pro;

public class ConcreteFactory implements Factory{
    @Override
    public Product create(String message) {
        System.out.println("concrete");
        return new IDCard(message);
    }
}
