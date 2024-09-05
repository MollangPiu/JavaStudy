package campus.design.observer.test02;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
    private List<Observer> observerList;
    private String message;

    public ConcreteSubject() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregistObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observerList) {
            observer.update(message);
        }
    }

    public void postMessage(String message) {
        this.message = message;
        notifyObserver();
    }
}
