package campus.design.template.test;

public class King extends Player{
    public King(String name) {
        super(name);
        super.hp = 100;
    }

    @Override
    void attack(Player player) {
        player.suffer(this);
    }
}
