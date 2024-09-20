package campus.design.observer.test04;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> list;

    public Subject() {
        list = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        list.add(observer);
    }

    public void change(int num) {
        for(int i = 0; i < list.size(); i++) {
            list.get(i).setNum(num);
        }
    }

    public void disp() {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(i+": "+list.get(i).getNum());
        }
    }
}
