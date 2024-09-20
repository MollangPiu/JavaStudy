package campus.design.bridge.test03;

public class Calc {

    int num1;
    int num2;

    public Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void plus() {
        System.out.println("더하기 값: "+(num1+num2));
    }
}
