package campus.design.template;

public class Bat extends Monster{

    public Bat(char prefix) {
        super(prefix);
    }

    @Override
    public void attack(Character character) {

    }

    @Override
    public String getName() {
        return "박쥐 "+getPrefix();
    }
}
