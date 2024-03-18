package campus.study;

interface inter {

    int NUM = 10;

    void test();

    void read();

    int write(String bookName);
}

class InterManager implements inter{

    @Override
    public void test() {

    }

    @Override
    public void read() {

    }

    @Override
    public int write(String bookName) {
        return 0;
    }
}
public class InterfaceMain {

    public static void main(String[] args) {

    }
}
