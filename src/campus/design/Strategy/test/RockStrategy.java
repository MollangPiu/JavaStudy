package campus.design.Strategy.test;

public class RockStrategy implements Strategy {
    @Override
    public Hand nextHand() {
        return Hand.Rock;
    }
}
