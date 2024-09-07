package campus.design.Bridge;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("EmailSender: "+message);
    }
}
