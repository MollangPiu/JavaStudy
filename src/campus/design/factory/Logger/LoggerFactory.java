package campus.design.factory.Logger;

abstract class LoggerFactory {
    public abstract Logger create();

    public void logMessage(String message) {
        Logger logger = create();
        logger.log(message);
    }
}
