package campus.design.state.pro;

public class ConcreteStateC implements State{

    @Override
    public void handle(Context context) {
        execute();
        context.setState(new ConcreteStateA());
    }

    @Override
    public void execute() {
        System.out.println("Context C 사용 영역");
    }
}
