package campus.ch10;

/**
 * 메소드와 필드와의 관계
 * + this
 */
public class Method03 {

    public static void main(String[] args) {
        Assist03 assist03 = new Assist03();
        assist03.test();
    }
}

class Assist03 {

    int num = 50;


    
    public void test() {
        int num = 100;
        System.out.println(num);
    }
}