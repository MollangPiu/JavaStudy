package campus.design.factory.Logger;

class AlertLoggerFactory extends LoggerFactory{
    @Override
    public Logger create() {
        return new AlertLogger();
    }
}
