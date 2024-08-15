package campus.design.memento;


public class Memento {
    private MacroCommand state;

    public Memento(MacroCommand state) {
        //그대로 가져오면, 주소가 같기 때문에 이전으로 되돌릴 수가 없다.
        this.state = state.clone();
    }

    public MacroCommand getSavedState() {
        return state.clone();
    }
}
