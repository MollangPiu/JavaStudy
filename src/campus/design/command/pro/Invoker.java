package campus.design.command.pro;

import java.util.ArrayList;

public class Invoker {

    private Command command;

    ArrayList<CalcLog> list;

    public Invoker() {
        list = new ArrayList<>();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute(int num1, int num2) {
        this.command.execute(num1, num2);
        list.add(new CalcLog(command.getCommand(), num1, num2));
    }

    public void print() {
        this.command.print();
    }

    public void getLog() {
        for(CalcLog li: list) {
            System.out.println(li.toString());
        }
    }
}
