package campus.design.template.test;

public class Knight extends Player{
    public Knight(String name) {
        super(name);

    }

    @Override
    void attack(Player player) {
        super.attack = 20;
        player.suffer(this);
    }
}
