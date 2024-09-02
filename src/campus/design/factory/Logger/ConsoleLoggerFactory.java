package campus.design.factory.Logger;

class ConsoleLoggerFactory extends LoggerFactory{
    @Override
    public Logger create() {
        return new ConsoleLogger();
    }
}
