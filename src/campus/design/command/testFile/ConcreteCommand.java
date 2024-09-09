package campus.design.command.testFile;

public class ConcreteCommand implements Command{
    Light light;
    public ConcreteCommand(Light light) {
        this.light = light;
    }

    @Override
    public void getLight() {
        if(light.isStatus()) {
            System.out.println(light.getName()+" / Light on");
        }
        else {
            System.out.println(light.getName()+" / Light off");
        }
    }

    @Override
    public void setOnOff() {
        light.change();
    }

    @Override
    public void setName(String name) {
        this.light.setName(name);
    }
}
