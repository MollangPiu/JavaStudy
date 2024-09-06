package campus.design.Strategy.pro;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new AppleStrategy("파랑색"));
        context.execute("Hello World");
        context.print();

        context = new Context(new BananaStrategy("슈퍼맨", 100));
        context.execute("HI");
        context.print();
    }
}
