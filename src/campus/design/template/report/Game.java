package campus.design.template.report;


abstract class Game {
    // 템플릿 메서드 정의
    final void play() {
        start();
        while (!end()) {
            playTurn();
        }
        printWinner();
    }

    abstract void start();
    abstract boolean end();
    abstract void playTurn();
    abstract void printWinner();
}