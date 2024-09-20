package campus.design.bridge.report;

public class TextSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("TextMessageSender: "+message);
    }
}
