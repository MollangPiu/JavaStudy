package campus.design.proxy.test01;

public class Main {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.move();

        //문제 발생, 과정과 결과를 나눈 것은 좋다.
        //bridge하고 역할이 중첩되는 문제가 발생이 된다.
        RealProxy realProxy = new RealProxy(new Goal());
        realProxy.work("Hello World");
    }
}
