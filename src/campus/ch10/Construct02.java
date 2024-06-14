package campus.ch10;

public class Construct02 {

    public Construct02() {
        System.out.println("ttt");
    }

    public Construct02(int num) {
        System.out.println("숫자: "+num);
    }
    public static void main(String[] args) {
        Construct02 construct01 = new Construct02();
        Construct02 construct02 = new Construct02(100);

    }


}
