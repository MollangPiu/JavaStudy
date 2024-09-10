package campus.design.proxy.report02;

public class Client {
    public static void main(String[] args) {
        CalculatorService calculator = new CalculatorServiceProxy();
        double resultAdd = calculator.add(10.0, 5.0);
        System.out.println("Addition result: " + resultAdd);

        double resultSubtract = calculator.subtract(10.0, 5.0);
        System.out.println("Subtraction result: " + resultSubtract);
    }
}
