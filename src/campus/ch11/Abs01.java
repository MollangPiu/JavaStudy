package campus.ch11;

public class Abs01 {

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


