package campus.design.command.testfile02;

public class ConcreteCommandOn implements Command {
    Light light;

    public ConcreteCommandOn(Light light) {
        this.light = light;
    }

    @Override
    public void isGetLight() {
        System.out.println("상태: "+this.light.isStatus());
    }

    @Override
    public void execute() {
        this.light.change(true);
    }
}
