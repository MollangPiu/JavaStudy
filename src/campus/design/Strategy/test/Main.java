package campus.design.Strategy.test;

class Main
{
    public static void main(String[] args) {
        Player player1 = new Player("player1", new RockStrategy());
        Player player2 = new Player("player2", new PaperStrategy());
        Player player3 = new Player("player3", new RandomStrategy());

        System.out.println(player1.nextHand().fight(player2.nextHand()));
        System.out.println("==========================================");
        for (int i = 0; i < 10; i++) {
            System.out.println(player1.nextHand().fight(player3.nextHand()));

        }

    }
}
