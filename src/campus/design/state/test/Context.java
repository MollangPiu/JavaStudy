package campus.design.state.test;

// 두 번째 생성
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    //변경하기
    public void handle() {
        state.handle(this);
    }
    
    //동적 바인딩 기능
    public void execute() {
        state.execute();
    }
}
