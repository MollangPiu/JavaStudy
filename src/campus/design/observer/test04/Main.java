package campus.design.observer.test04;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new DefaultObserver();
        observer1.setNum(10);
        subject.addObserver(observer1);


        Observer observer2 = new TwoObserver();
        observer2.setNum(33);
        subject.addObserver(observer2);

        subject.disp();

        subject.change(50);
        subject.disp();

    }
}
