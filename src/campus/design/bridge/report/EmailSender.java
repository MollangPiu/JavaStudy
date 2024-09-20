package campus.design.bridge.report;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("EmailSender: "+message);
    }
}
