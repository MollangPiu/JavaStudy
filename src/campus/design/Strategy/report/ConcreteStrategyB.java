package campus.design.Strategy.report;

public class ConcreteStrategyB implements StrategyInterface {

    private String name;
    private int cnt;
    private String message;

    public ConcreteStrategyB(String name, int cnt) {
        this.name = name;
        this.cnt = cnt;
    }

    @Override
    public void execute(String message) {
        this.message = message;
    }

    @Override
    public void print() {
        System.out.println("그의 이름은 "+name);
        System.out.println("Banana의 갯수: "+cnt);
        System.out.println("message: "+message);
    }
}
