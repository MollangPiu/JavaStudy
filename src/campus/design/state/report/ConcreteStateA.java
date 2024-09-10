package campus.design.state.report;

public class ConcreteStateA implements State{
    public void handle(Context context) {
        System.out.println("Handling state A");
        context.setState(new ConcreteStateB());
    }
}
