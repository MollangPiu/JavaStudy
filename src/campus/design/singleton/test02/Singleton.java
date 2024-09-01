package campus.design.singleton.test02;

public class Singleton {
    //private 정적 인스턴스
    private static Singleton instance;

    // private 생성자
    private Singleton() {};

    //public method
    public static Singleton getInstance() {
        if(instance == null) instance = new Singleton();

        return instance;
    }
}
