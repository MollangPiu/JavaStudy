package campus.design.Strategy.test03;

public class Main {

    public static void main(String[] args) {
        Context context = new Context(new WriteStrategy());
        context.work();

        context = new Context(new ExelStrategy());
        context.work();
    }
}
