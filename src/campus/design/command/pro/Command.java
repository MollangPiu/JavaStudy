package campus.design.command.pro;

public interface Command {
    void execute(int num1, int num2);
    void print();

    String getCommand();
}
