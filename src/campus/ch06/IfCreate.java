package campus.ch06;

public class IfCreate {

    public static void main(String[] args) {

        //조건 IF
        //if(비교연산자 true 혹은 false)

        if(true) {
            System.out.println("실행 확인1 / true");
        }

        if(false) {
            System.out.println("실행 확인2 / false");
        }


        if(10 > 5) {
            System.out.println("true");
        }


        if(100 < 5) {
            System.out.println("false");
        }


        int num = 100;
        if(num > 5) {
            System.out.println("?");
        }

        String str = "abc";
        if(str.equals("abc")) {
            System.out.println("?");
        }


        if(true && true) {
            System.out.println("and의 값은?");
        }

        if(true || false) {
            System.out.println("or의 값은?");
        }


        int num01 = 50;
        int num02 = 30;
        if(num01 > num02) {
            System.out.println("num1은 num2보다 크다.");
        }

        if(num01 > num02*100) {
            System.out.println("num2*100은 num01보다 작다.");
        }


        //Step 02
        System.out.println("=================================");

        num01 = 50;
        if(num01 == 10) {
            System.out.println("num01은 10이다.");
        }
        else {
            System.out.println("num01은 10이 아니다.");
        }

        num01 = 50;
        if(num01 == 50) {
            System.out.println("num01은 50이다.");
        }
        else {
            System.out.println("num01은 50이 아니다.");
        }

        num01 = 50;
        num02 = 100;
        if(num01 == 10) {
            System.out.println("num01은 10이다.");
        } else if(num02 == 10) {
            System.out.println("num02는 10이다.");
        }
        else if(num01 == 100 || num02 == 100) {
            System.out.println("num01은 100 혹은 num02는 100이다.");
        }

        num01 = 50;
        num02 = 100;
        int num03 = 10;
        if(num01 == 10) {
            System.out.println("num01은 10이다.");
        } else if(num02 == 10) {
            System.out.println("num02는 10이다.");
        }
        else if(num01 == 100 || num02 == 100) {
            System.out.println("num01은 100 혹은 num02는 100이다.");
        }
        else if(num03 == 10) {
            System.out.println("num03은 10이다.");
        }


        //Quiz
        System.out.println("====================================");
        System.out.println("홀 짝을 구분하는 if 문 만들기");

        num = 50;
        if(num %2 == 1) {
            System.out.println("결과값은 홀수입니다.");
        }
    }
}
