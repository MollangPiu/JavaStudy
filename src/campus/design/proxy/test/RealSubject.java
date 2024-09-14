package campus.design.proxy.test;

public class RealSubject implements Subject{
    @Override
    public void use() {
        System.out.println("execute");
    }
}
