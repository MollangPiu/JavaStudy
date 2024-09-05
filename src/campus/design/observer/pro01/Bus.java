package campus.design.observer.pro01;

public class Bus implements Car{

    private String name;

    public Bus(String name) {
        this.name = name;
    }

    @Override
    public void setMessage(String message) {
        System.out.println(name+" Bus: "+message);
    }
}
