package campus.design.state.pro;

public class Main {
    public static void main(String[] args) {

        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.request();
        context.execute();
        context.request();
        context.request();
    }
}
