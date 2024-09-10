package campus.design.state.pro;

public class ConcreteStateA implements State{

    @Override
    public void handle(Context context) {
        execute();
        context.setState(new ConcreteStateB());
    }

    @Override
    public void execute() {
        System.out.println("Context A 사용 영역");
    }
}
