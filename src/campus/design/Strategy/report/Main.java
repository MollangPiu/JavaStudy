package campus.design.Strategy.report;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA("파랑색"));
        context.execute("Hello World");
        context.print();

        context = new Context(new ConcreteStrategyB("슈퍼맨", 100));
        context.execute("HI");
        context.print();
    }
}
