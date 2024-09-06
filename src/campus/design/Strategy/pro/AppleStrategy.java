package campus.design.Strategy.pro;

public class AppleStrategy implements StrategyInterface{

    private String message;
    private String color;
    public AppleStrategy(String color) {
        this.color = color;
    }

    @Override
    public void execute(String message) {
        this.message = message;
    }

    @Override
    public void print() {
        System.out.println(color+" 사과의 메세지: "+message);
    }
}
