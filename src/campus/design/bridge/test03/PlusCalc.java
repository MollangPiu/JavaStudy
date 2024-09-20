package campus.design.bridge.test03;

public class PlusCalc {

    private  Calc calc;

    public PlusCalc(Calc calc) {
        this.calc = calc;
    }

    public void mul() {
        System.out.println("곱하기 값: "+(calc.num1 * calc.num2));
    }
}
