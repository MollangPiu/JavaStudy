package campus.design.Strategy;

public class PaperStrategy implements Strategy{
    @Override
    public Hand nextHand() {
        return Hand.Paper;
    }
}
