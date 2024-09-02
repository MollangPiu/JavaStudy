package campus.design.factory.test03;

import campus.design.factory.test03.StudentCard;

public class StudentCardFactory implements Factory{

    @Override
    public StudentCard create(String name) {
        return new StudentCard(name);
    }
}
