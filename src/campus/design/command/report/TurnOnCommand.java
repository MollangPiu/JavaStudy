package campus.design.command.report;

public class TurnOnCommand implements Command {

    private Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void excute() {
        light.turnOn();
    }
}
