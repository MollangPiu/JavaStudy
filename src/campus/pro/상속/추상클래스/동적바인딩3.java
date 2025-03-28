package campus.pro.상속.추상클래스;

public class 동적바인딩3 {

    public static void main(String[] args) {
        상점 book = new 서점();
        book.getStore();
        book = new 마트();
        book.getStore();
    }
}

abstract class 상점 {
    abstract public void getStore();
}

class 서점 extends 상점 {
    @Override
    public void getStore() {
        System.out.println("책 한 권");
    }
}

class 마트 extends 상점 {
    @Override
    public void getStore() {
        System.out.println("사과 하 나");
    }
}