package campus.design.state.pro;

public interface State {
    //변경 함수
    void handle(Context context);

    //실제 사용 함수
    void execute();
}
