package campus.design.Strategy.test03;

public class ExelStrategy implements Strategy{
    @Override
    public void use() {
        System.out.println("컴퓨터");
    }

    @Override
    public void execute() {
        System.out.println("엑셀에 표를 작성하다.");
    }
}
