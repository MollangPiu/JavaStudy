package campus.ch10;


/**
 * 메소드 연습하기 1
 */
public class Method01 {

    public static void main(String[] args) {

        Assist assist = new Assist();
        assist.print();

        String str = assist.hello();
        System.out.println(str);

    }
}

class Assist {

    public void print() {
        System.out.println("출력하기");
    }

    public String hello() {
        return "Hello World";
    }
}
