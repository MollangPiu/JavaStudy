package campus.design.Strategy.test03;

public class WriteStrategy implements Strategy{
    @Override
    public void use() {
        System.out.println("볼펜");
    }

    @Override
    public void execute() {
        System.out.println("수첩에 작성하다.");
    }
}
