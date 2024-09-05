package campus.design.observer.test03;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

    private List<Observer> list = new ArrayList<>();
    private String message;
    @Override
    public void regist(Observer ob) {
        list.add(ob);
    }

    @Override
    public void show() {
        for(Observer ob : list) {
            ob.setMessage(message);
        }
    }

    public void message(String message) {
        this.message = message;
        show();
    }
}
