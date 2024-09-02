package campus.design.factory.Logger;

class Main {
    public static void main(String[] args) {
        LoggerFactory logger = new ConsoleLoggerFactory();
        logger.logMessage("Hello World");

        logger = new AlertLoggerFactory();
        logger.logMessage("Java");
    }
}
