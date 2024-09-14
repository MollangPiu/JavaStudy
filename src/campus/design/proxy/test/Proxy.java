package campus.design.proxy.test;

public class Proxy {
    Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public int execute() {
        subject.use();

        return 10;
    }
}
