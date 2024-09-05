package campus.design.observer.test02;

public interface Subject {
    void registObserver(Observer observer);
    void unregistObserver(Observer observer);
    void notifyObserver();
}
