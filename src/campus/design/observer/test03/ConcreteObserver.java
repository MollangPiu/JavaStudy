package campus.design.observer.test03;

public class ConcreteObserver implements Observer{

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void setMessage(String message) {
        System.out.println(this.name+"님의 message: "+message);
    }
}
