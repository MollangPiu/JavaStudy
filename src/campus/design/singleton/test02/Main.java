package campus.design.singleton.test02;

public class Main {

    public static void main(String[] args) {

        Main main01 = new Main();
        Main main02 = new Main();
        System.out.println(main01);
        System.out.println(main02);
        System.out.println(main01 == main02);

        Singleton singleton01 = Singleton.getInstance();
        Singleton singleton02 = Singleton.getInstance();
        System.out.println(singleton01 == singleton02);
    }
}
