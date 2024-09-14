package campus.design.proxy.test;

import campus.design.proxy.report.RealImage;

public class Main {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);

        int result = proxy.execute();
        System.out.println("result: "+result);
    }
}
