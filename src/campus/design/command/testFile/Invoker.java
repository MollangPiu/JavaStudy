package campus.design.command.testFile;

public class Invoker {

    Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setName(String name) {
        this.command.setName(name);
    }

    public void change() {
        this.command.setOnOff();
    }

    public void status() {
        this.command.getLight();
    }
}
