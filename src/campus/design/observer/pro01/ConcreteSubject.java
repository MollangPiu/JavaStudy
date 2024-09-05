package campus.design.observer.pro01;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

    private List<Car> list = new ArrayList<>();
    private String message;

    @Override
    public void regist(Car car) {
        list.add(car);
    }

    @Override
    public void print() {
        for(Car li : list) {
            li.setMessage(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        print();
    }
}
