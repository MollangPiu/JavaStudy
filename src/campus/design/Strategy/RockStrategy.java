package campus.design.Strategy;

public class RockStrategy implements Strategy{
    @Override
    public Hand nextHand() {
        return Hand.Rock;
    }
}
