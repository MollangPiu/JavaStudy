package campus.design.state.test;

//세 번째 생성
public class Cat implements State{
    @Override
    public void handle(Context context) {
        context.setState(new Dog());
    }

    @Override
    public void execute() {
        System.out.println("야옹");
    }
}
