package campus.design.command.testFile01;

public class ConcreteCommandOff implements Command{
    Light light;

    public ConcreteCommandOff(Light light) {
        this.light = light;
    }

    @Override
    public void isGetLight() {
        System.out.println("상태: "+this.light.isStatus());
    }

    @Override
    public void execute() {
        this.light.change(false);
    }
}
