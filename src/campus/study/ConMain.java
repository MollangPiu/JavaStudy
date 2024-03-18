package campus.study;

public class ConMain {

    private String message;


    public ConMain() {
        message = "Coffee";
    }

    public ConMain(String message) {
        this.message = message;
    }



    public String disp() {
        return message;
    }

    public static void main(String[] args) {
        ConMain conMain = new ConMain();
        conMain = new ConMain();
        System.out.println(conMain.disp());

        ConMain conMain1 = new ConMain("Choco");
        System.out.println(conMain1.disp());
    }
}
