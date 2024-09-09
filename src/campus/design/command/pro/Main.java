package campus.design.command.pro;

public class Main {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        SumCommand sum = new SumCommand(receiver);
        MulCommand mul = new MulCommand(receiver);

        Invoker ink = new Invoker();
        ink.setCommand(sum);
        ink.execute(10, 5);
        ink.print();

        ink.execute(100, 50);
        ink.print();
        ink.setCommand(mul);
        ink.execute(9, 9);
        ink.execute(100,99);

        ink.getLog();
    }
}
