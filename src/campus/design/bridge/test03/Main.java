package campus.design.bridge.test03;

public class Main {

    public static void main(String[] args) {
        Calc calc = new Calc(5, 9);
        calc.plus();

        PlusCalc plus = new PlusCalc(calc);
        plus.mul();
    }
}
