package campus.design.observer.test02;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver obs1 = new ConcreteObserver("슈퍼맨");
        ConcreteObserver obs2 = new ConcreteObserver("배트맨");

        subject.registObserver(obs1);
        subject.registObserver(obs2);

        subject.postMessage("Hello World");
    }
}
