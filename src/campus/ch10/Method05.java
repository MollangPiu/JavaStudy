package campus.ch10;


/**
 * 필드, method 복습하기
 */
public class Method05 {

    public static void main(String[] args) {

        Assist05 assist05 = new Assist05();
        assist05.name = "홍길동";

        assist05.setNum(50);
        int num = assist05.getNum();

        System.out.println(assist05.name);
        System.out.println(num);

    }
}

class Assist05 {

    String name;
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }


}