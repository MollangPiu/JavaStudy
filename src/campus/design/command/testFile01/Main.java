package campus.design.command.testFile01;

public class Main {

    public static void main(String[] args) {

        Light light = new Light();

        ConcreteCommandOn on = new ConcreteCommandOn(light);
        ConcreteCommandOff off = new ConcreteCommandOff(light);

        Invoker ink = new Invoker(on);
        ink.change();

        ink.status();

        ink = new Invoker(off);
        ink.status();

        ink.change();
        ink.status();


    }
}
