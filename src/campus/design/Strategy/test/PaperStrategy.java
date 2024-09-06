package campus.design.Strategy.test;

public class PaperStrategy implements Strategy {
    @Override
    public Hand nextHand() {
        return Hand.Paper;
    }
}
