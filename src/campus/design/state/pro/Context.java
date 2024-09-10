package campus.design.state.pro;

public class Context {
    private State state;

    // 변경로직에서, 변경 될 State값 담는 함수
    public void setState(State state) {
        this.state = state;
    }

    // 변경 로직
    public void request() {
        state.handle(this);
    }

    // State 기능 구현 1
    public void execute() {
        state.execute();
    }
}
