package campus.design.proxy.report02;

public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double subtract(double a, double b) {
        return a-b;
    }
}
