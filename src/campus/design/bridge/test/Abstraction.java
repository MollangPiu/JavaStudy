package campus.design.bridge.test;

public class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void display() {
        implementor.print();
        System.out.println("Abstraction: "+implementor.getNum());
    }

    public void setNum(int num) {
        System.out.println("Abs setNum");
        implementor.setNum(num);
    }
}
