package campus.study;

class AA {
    private int a;

    public AA() {

    }

    public AA(int num) {
        this.a = num;
    }

    public int getA() {
        return this.a;
    }

}

class BB extends AA{

    private int b;
    public BB() {
        super();
    }

    public BB(int num1, int num2) {
        super(num1);
        this.b = num2;
    }

    public int getB() {
        return this.b;
    }
}

class CC extends BB{

    private int c;

    public CC(int num1, int num2, int num3) {
        super(num1, num2);
        this.c = num3;
    }

    public int getC() {
        return this.c;
    }
}
public class ExtendsObject {

    public static void main(String[] args) {

        //CC cc = new CC();
        CC cc = new CC(10, 20, 30);

        System.out.println(cc.getA());
        System.out.println(cc.getB());
        System.out.println(cc.getC());

    }
}
