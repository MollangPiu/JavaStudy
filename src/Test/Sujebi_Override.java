package Test;

class Sujebi_Access {
    Sujebi_Access() {
        System.out.println("Test");
    }
}

public class Sujebi_Override {

    //Orverroding 1
    int test() {
        System.out.println("test");

        return 5;
    }

    void test(int cnt) {
        System.out.println("test1 "+ cnt);
    }

    public static void main(String[] args) {

    }
}
