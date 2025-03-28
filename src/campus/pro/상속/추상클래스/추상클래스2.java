package campus.pro.상속.추상클래스;


public class 추상클래스2 {

    public static void main(String[] args) {
        Mart mart = new Mart();
        mart.getStore();
    }
}

abstract class Store {
    public void getStore() {
        System.out.println("책 한권");
    }
}

class Mart extends Store {
    public void getStore() {
        System.out.println("사과 하나");
    }
}
