package campus.design.Bridge;

public class TextSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("TextMessageSender: "+message);
    }
}
