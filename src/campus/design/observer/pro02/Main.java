package campus.design.observer.pro02;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        HightStudent h1 = new HightStudent("서울고", "홍길동");
        HightStudent h2 = new HightStudent("인천고", "구길자");

        MiddleSchool m1 = new MiddleSchool("슈퍼맨", 100, 100, 100);
        MiddleSchool m2 = new MiddleSchool("배트맨", 90, 90, 90);

        subject.regist(h1);
        subject.regist(h2);
        subject.regist(m1);
        subject.regist(m2);

        subject.print();
    }
}
