package campus.test;



public class 상속테스트 {
    public static void main(String[] args) {
        자식 class1 = new 자식();
        class1.setNum(100);
        int num = class1.getNum();

        System.out.println(num);
    }
}

class 부모 {
    int num;
    public void setNum(int num) {
        this.num = num;
    }
}

class 자식 extends 부모 {
    public int getNum() {
        return num;
    }
}