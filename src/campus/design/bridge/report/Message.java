package campus.design.bridge.report;

abstract class Message {
    protected Sender sender;

    protected Message(Sender sender) {
        this.sender = sender;
    }

    abstract public void send();
}
