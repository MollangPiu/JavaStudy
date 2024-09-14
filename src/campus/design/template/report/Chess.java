package campus.design.template.report;

class Chess extends Game {
    private int turns = 0;
    private int maxTurns = 10;

    @Override
    void start() {
        System.out.println("Chess game started!");
    }

    @Override
    boolean end() {
        return turns == maxTurns;
    }

    @Override
    void playTurn() {
        turns++;
        System.out.println("Turn " + turns + ": move piece");
    }

    @Override
    void printWinner() {
        System.out.println("Player 1 wins after " + turns + " turns!");
    }
}