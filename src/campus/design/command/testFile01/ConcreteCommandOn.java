package campus.design.command.testFile01;

import campus.design.command.testFile.ConcreteCommand;

public class ConcreteCommandOn implements Command{
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
