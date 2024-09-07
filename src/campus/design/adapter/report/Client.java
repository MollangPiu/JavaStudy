package campus.design.adapter.report;

public class Client {
    private Target target;

    public Client(Target target) {
        this.target = target;
    }

    public void powerOn() {
        target.plugIn("Client Power on");
    }
}
