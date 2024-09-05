package campus.design.observer.pro01;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Car bus = new Bus("타요");
        Car texi = new Texi("카카오");
        Car metro = new Metro("코레일");

        subject.regist(bus);
        subject.regist(texi);
        subject.regist(metro);

        subject.setMessage("Hello");
    }
}
