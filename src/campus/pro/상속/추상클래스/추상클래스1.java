package campus.pro.상속.추상클래스;

public class 추상클래스1 {

    public static void main(String[] args) {


    }
}

abstract class Stu {
    String name;

    public abstract void print();
}

class Stu01 extends Stu{

    @Override
    public void print() {
        System.out.println("수학학");
   }
}


