package campus.design.template.game;

public class Main {
    public static void main(String[] args) {
        Player king = new King("king");
        Player kngiht = new Knight("knight");

        king.attack(kngiht);
        kngiht.attack(king);
    }
}