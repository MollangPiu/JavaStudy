package campus.design.template;

public abstract class Monster implements Character{
    private char prefix;
    private int hp;

    public Monster(char prefix) {
        this.prefix = prefix;
        this.hp = 50;
    }

    public char getPrefix() {
        return prefix;
    }

    public int getHp() {
        return hp;
    }

}
