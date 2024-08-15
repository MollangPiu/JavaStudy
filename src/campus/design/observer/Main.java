package campus.design.observer;

class Main {

    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();

        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphicObserver();
        Observer observer3 = number -> {
            for (int i = 0; i < number; i++) {
                System.out.print("=");
            }
            System.out.println();
        };

        randomGenerator.addObserver(observer1);
        randomGenerator.addObserver(observer2);
        randomGenerator.addObserver(observer3);

        randomGenerator.execute();
        randomGenerator.execute();
        randomGenerator.execute();
    }
}
