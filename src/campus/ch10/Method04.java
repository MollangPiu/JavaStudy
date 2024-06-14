package campus.ch10;

/**
 * Getter Setter
 */
public class Method04 {

    public static void main(String[] args) {

        Assist04 assist04 = new Assist04();
        assist04.setNum(150);
        System.out.println(assist04.getNum());
    }
}

class Assist04 {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
