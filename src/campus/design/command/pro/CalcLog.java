package campus.design.command.pro;

public class CalcLog {
    private String operation;
    private int firstNum;
    private int secondNum;

    public CalcLog(String operation, int firstNum, int secondNum) {
        this.operation = operation;
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
    @Override
    public String toString() {
        return "CalcLog{" +
                "operation='" + operation + '\'' +
                ", firstNum=" + firstNum +
                ", secondNum=" + secondNum +
                '}';
    }
}
