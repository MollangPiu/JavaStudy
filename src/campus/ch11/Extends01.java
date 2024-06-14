package campus.ch11;

/**
 * 상속에 대한 기본 기능
 */
public class Extends01 {

    public static void main(String[] args) {

        Bus bus = new Bus();
        bus.run();
        bus.addAction();

        System.out.println("====================");

        Texi texi = new Texi();
        texi.run();
        texi.addAction();
    }
}

class Car {


    public void run() {
        System.out.println("부릉부릉");
    }
}

class Bus extends Car{

    public void addAction() {
        System.out.println("승객 탑승");
        System.out.println("승객 하차");
    }
}

class Texi extends Car {
    
    public void addAction() {
        System.out.println("승객 기다리기");
    }
}