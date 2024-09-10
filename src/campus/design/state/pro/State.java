package campus.design.state.pro;

public interface State {
    //변경하다
    void handle(Context context);

    void execute();
}
