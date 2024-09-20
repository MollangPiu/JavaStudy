package campus.design.proxy.testAfter;

public class Goal implements Subject{

    private String destination;

    public Goal(String destination) {
        this.destination = destination;
    }


    @Override
    public void disp() {
        System.out.println("목적지: "+destination);
        System.out.println("도착 완료");
    }
}
