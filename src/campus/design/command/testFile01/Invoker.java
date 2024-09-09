package campus.design.command.testFile01;

public class Invoker {
    Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void status() {
        this.command.isGetLight();
    }

    public void change() {
        this.command.execute();
    }
}
