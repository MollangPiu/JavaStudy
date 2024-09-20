package campus.design.Strategy.test03;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void work() {
        strategy.use();
        strategy.execute();
    }
}
