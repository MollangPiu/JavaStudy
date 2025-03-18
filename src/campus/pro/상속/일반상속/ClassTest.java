package campus.pro.상속.일반상속;

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

