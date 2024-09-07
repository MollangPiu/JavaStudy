package campus.design.factory.pro;

public class IDCard implements Product{
    private String message;
    public IDCard(String message) {
        this.message = message;
    }

    @Override
    public void use() {
        System.out.println("Idcard 사용, "+message);
    }
}
