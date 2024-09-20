package campus.design.command.testfile02;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    List<Log> list;
    Command command;

    public void setCommand(Command command) {
        this.command = command;

        Log log = new Log();
        log.setCommand(command);
        log.setCnt(5);
        this.list.add(log);
    }

    public Command getCommand(int i) {
        return list.get(i).getCommand();
    }

    public Invoker() {
        list = new ArrayList<>();
    }

    public void status() {
        this.command.isGetLight();
    }

    public void change() {
        this.command.execute();
    }

    public class Log {
        Command command;
        int cnt;

        public Command getCommand() {
            return command;
        }

        public void setCommand(Command command) {
            this.command = command;
        }

        public int getCnt() {
            return cnt;
        }

        public void setCnt(int cnt) {
            this.cnt = cnt;
        }
    }
}
