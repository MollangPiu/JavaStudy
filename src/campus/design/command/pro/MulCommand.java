package campus.design.command.pro;

public class MulCommand implements Command{

    private Receiver receiver;

    public MulCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(int num1, int num2) {
        int result = num1 * num2;
        this.receiver.setNum(result);
    }

    @Override
    public void print() {
        System.out.println("결과: "+this.receiver.getNum());
    }

    @Override
    public String getCommand() {
        return "mul";
    }
}
