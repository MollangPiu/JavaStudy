package campus.design.bridge.report;

public class EmailMessage extends Message{

    private String emailContent;

    public EmailMessage(String content, Sender sender) {
        super(sender);
        this.emailContent = content;
    }
    @Override
    public void send() {
        sender.sendMessage(emailContent);
    }
}
