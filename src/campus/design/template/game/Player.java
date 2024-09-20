package campus.design.template.game;

public abstract class Player {
    private String name;
    protected int hp;
    protected int attack;

    public Player(String name) {
        this.name = name;
        this.hp = 50;
        this.attack = 10;
    }

    abstract void attack(Player player);
    public void suffer(Player player) {
        this.hp -= player.attack;
        System.out.println(this.name+": "+ player.name+"이 공격했습니다.");
        System.out.println("남은 hp: "+this.hp);
    }
}