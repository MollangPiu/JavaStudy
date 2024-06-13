package campus.ch10.question;

import java.util.Scanner;

public class Method01 {

    /**
     * 사칙 연산 만들기
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 수");
        int firstNum = sc.nextInt();

        System.out.println("두 번째 수");
        int secondNum = sc.nextInt();

        Cal cal = new Cal();
        cal.sub(firstNum, secondNum);
        cal.minus(firstNum, secondNum);
        cal.mul(firstNum, secondNum);
        cal.div(firstNum, secondNum);

    }
}

class Cal {
    public void sub(int firstNum, int secondNum) {
        System.out.println(firstNum+" + "+secondNum+" = "+(firstNum+secondNum));
    }

    public void minus(int firstNum, int secondNum) {
        System.out.println(firstNum+" - "+secondNum+" = "+(firstNum-secondNum));
    }

    public void mul(int firstNum, int secondNum) {
        System.out.println(firstNum+" * "+secondNum+" = "+(firstNum*secondNum));
    }

    public void div(int firstNum, int secondNum) {
        System.out.println(firstNum+" / "+secondNum+" = "+(firstNum/secondNum));
    }
}
