package campus.design.Strategy.pro;

public class Context {
    StrategyInterface strategy;

    public Context(StrategyInterface strategy) {
        this.strategy = strategy;
    }

    public void execute(String message) {
        strategy.execute(message);
    }

    public void print() {
        strategy.print();
    }
}
