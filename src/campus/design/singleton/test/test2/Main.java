package campus.design.singleton.test.test2;

class Main {

    public static void main(String[] args) {
        Singleton singleton1 = new Singleton();
        Singleton singleton2 = singleton1.getInstance();

        System.out.println(singleton1 == singleton2);
    }
}
