package campus.design.state.test;

//마지막
public class Main {

    public static void main(String[] args) {
        State state = new Cat();
        Context context = new Context();
        context.setState(state);

        //여기서부터, state 사용 이유.
        //기능 구현 부분에 인스턴스화를 보여주지 않는다.
        context.execute();

        context.handle();
        context.execute();

        context.handle();
        context.execute();
    }
}
