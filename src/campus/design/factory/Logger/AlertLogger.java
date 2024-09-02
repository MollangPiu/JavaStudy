package campus.design.factory.Logger;

class AlertLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Alert: "+message);
    }
}
