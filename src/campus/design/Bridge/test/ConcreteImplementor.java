package campus.design.bridge.test;

public class ConcreteImplementor implements Implementor{
    private int num;

    @Override
    public void print() {
        System.out.println("ConcreteImplementor print");
    }
    @Override
    public void setNum(int num) {
        this.num = num;
    }
    @Override
    public int getNum() {
        return num;
    }
}
