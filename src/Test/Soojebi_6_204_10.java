package Test;

class Parent extends TTT{
    public Parent() {
        System.out.print("A");
    }

    public void fn() {
        System.out.print("B");
    }

    public void fnA() {
        System.out.print("C");
    }
}

class Child extends Parent {
    public Child() {
        System.out.print("D");
    }

    @Override
    public void fn() {
        System.out.print("E");
    }


    public void fnB() {
        System.out.print("F");
    }
}

public class Soojebi_6_204_10 {
    public static void main(String[] args) {
        Child c = new Child();
        c.fn();
        c.fnA();
    }
}