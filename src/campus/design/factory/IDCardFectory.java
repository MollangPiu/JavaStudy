package campus.design.factory;

public class IDCardFectory implements Fectory{
    @Override
    public IDCard createProduct(String name) {
        return new IDCard(name);
    }
}
