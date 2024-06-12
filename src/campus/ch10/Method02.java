package campus.ch10;

public class Method02 {

    public static void main(String[] args) {
        Assist02 assist02 = new Assist02();
        assist02.print(100);
        assist02.sub(10, 5);
    }
}

class Assist02 {

    public void print(int num) {
        System.out.println("출력결과: "+num);
    }

    public int sub(int firstNum, int secondNum) {
        return firstNum+secondNum;
    }
}
