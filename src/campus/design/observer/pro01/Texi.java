package campus.design.observer.pro01;

public class Texi implements Car{
    private String name;

    public Texi(String name) {
        this.name = name;
    }
    @Override
    public void setMessage(String message) {
        System.out.println(name+" texi: "+message);
    }
}
