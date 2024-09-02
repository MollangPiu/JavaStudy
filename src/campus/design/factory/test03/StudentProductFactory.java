package campus.design.factory.test03;

public class StudentProductFactory implements Factory{

    @Override
    public StudentProduct create(String name) {
        return new StudentProduct(name);
    }
}
