package campus.design.command.report;

public class TurnOffCommand implements Command{

    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.turnOff();
    }
}
