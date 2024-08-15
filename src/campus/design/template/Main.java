package campus.design.template;

class Main {

    public static void main(String[] args) {
        Hero hero = new Hero("용사");
        Monster monster = new Slime('A');
        
        SuperHero superHero = new SuperHero("슈퍼맨");

        hero.attack(monster);
        superHero.setFlying(true);
        superHero.attack(monster);
    }
}
