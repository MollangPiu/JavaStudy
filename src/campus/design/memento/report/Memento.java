package campus.design.memento.report;

public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    protected String getState() {
        return state;
    }
}
