package campus.design.observer.pro01;

public class Metro implements Car{
    private String name;
    public Metro(String name) {
        this.name = name;
    }
    @Override
    public void setMessage(String message) {
        System.out.println(name+" 지하철: "+message);
    }
}
