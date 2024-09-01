package campus.design.singleton.test;

public class Singleton {
    private static final Singleton sInstance = new Singleton();

    public static Singleton getInstance() {
        return sInstance;
    }
}
