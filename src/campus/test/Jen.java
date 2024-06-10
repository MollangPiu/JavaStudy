package campus.test;

class Fruit{

    public String toString() {
        System.out.println("Fruit");

        return "fruit";
    }

    public void print() {
        System.out.println("cnt");
    }
}

class Apple extends Fruit{

    public String toString() {
        System.out.println("Apple");
        return "apple";
    }

    public void apple() {
        System.out.println("apple");
    }
}

public class Jen {

    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        Fruit apple = new Apple();

        apple.toString();
        apple.print();


    }
}


