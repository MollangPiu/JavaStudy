package campus.design.command.testFile;

public class Main {
    public static void main(String[] args) {
        Light light1 = new Light("Red");
        Light light2 = new Light("Blue");

        Command cmd1 = new ConcreteCommand(light1);
        Command cmd2 = new ConcreteCommand(light2);

        Invoker ink = new Invoker(cmd1);

        ink.change();
        ink.status();

        ink = new Invoker(cmd2);
        ink.status();

        ink.setName("Green");
        ink.change();
        ink.status();
    }
}
