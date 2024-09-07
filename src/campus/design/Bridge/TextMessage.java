package campus.design.Bridge;

public class TextMessage extends Message{
    private String text;

    public TextMessage(String text, Sender sender) {
        super(sender);
        this.text = text;
    }

    @Override
    public void send() {
        sender.sendMessage(text);
    }
}
