package campus.design.state.test;

//네 번째 생성
public class Dog implements State{
    @Override
    public void handle(Context context) {
        context.setState(new Cat());
    }

    @Override
    public void execute() {
        System.out.println("멍멍");
    }
}
