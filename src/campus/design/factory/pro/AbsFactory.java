package campus.design.factory.pro;

public class AbsFactory implements Factory{
    @Override
    public Product create(String message) {
        System.out.println("abs");
        return new IDCard(message);
    }
}
