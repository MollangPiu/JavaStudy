package campus.design.command.testfile02;

public class Main {

    public static void main(String[] args) {

        Light light = new Light();

        ConcreteCommandOn on = new ConcreteCommandOn(light);
        ConcreteCommandOff off = new ConcreteCommandOff(light);

        Invoker ink = new Invoker();
        ink.setCommand(on);
        ink.change();

        ink.status();

        ink.setCommand(off);
        ink.status();

        ink.change();
        ink.status();


        ink.getCommand(0);
    }
}
