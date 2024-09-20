package campus.design.bridge.report;

public class Main {
    public static void main(String[] args) {
        Sender textSender = new TextSender();
        Sender emailSender = new EmailSender();

        Message textMessage = new TextMessage("Text Hello", textSender);
        Message emailMessage = new EmailMessage("Email Hello", emailSender);

        textMessage.send();
        emailMessage.send();
    }
}
