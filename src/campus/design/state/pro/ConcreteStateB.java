package campus.design.state.pro;

public class ConcreteStateB implements State{

    @Override
    public void handle(Context context) {
        execute();
        context.setState(new ConcreteStateC());
    }

    @Override
    public void execute() {
        System.out.println("Context B 사용 영역");
    }
}
