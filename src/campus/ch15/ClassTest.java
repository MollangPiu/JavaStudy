package campus.ch15;

public class ClassTest {
    private static Aclass aclass;

    public static void main(String[] args) {

        Aclass aclass = new Bclass();
        aclass.test();

    }
}

class Aclass {
    int test;
    void test() {}

}

class Bclass extends Aclass {

    @Override
    void test() {
        System.out.println("test");
    }

    void feal() {
        System.out.println("feal");
    }
}

