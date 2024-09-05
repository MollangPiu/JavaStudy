package campus.design.observer.test03;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver ob1 = new ConcreteObserver("슈퍼맨");
        ConcreteObserver ob2 = new ConcreteObserver("배트맨");

        subject.regist(ob1);
        subject.regist(ob2);

        subject.message("Hello World");
    }
}
