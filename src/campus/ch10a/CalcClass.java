package campus.ch10a;

import java.util.Scanner;

class CalcClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 값은?");
        int firstNum = scanner.nextInt();

        System.out.println("두 번째 값은?");
        int secondNum = scanner.nextInt();

        CalcMove calcMove = new CalcMove();

        System.out.println("더하기 값은 "+calcMove.plus(firstNum, secondNum));
        System.out.println("빼기 값은 "+calcMove.minus(firstNum, secondNum));
        System.out.println("곱하기 값은 "+calcMove.multiplication(firstNum, secondNum));
        System.out.println("나누기 값은 "+calcMove.division(firstNum, secondNum));
    }
}

class CalcMove {

    int num;


    int plus(int num1, int num2) {
        return num1+num2;
    }

    int minus(int num1, int num2) {
        return num1-num2;
    }

    int multiplication(int num1, int num2) {
        return num1*num2;
    }

    int division(int num1, int num2) {
        return num1/num2;
    }



    void testMethod() {
        System.out.println("testMethod");
    }
    void testMethod(int num) {
        System.out.println("testMethod");
    }
    void testMethod(String str) {
        System.out.println("testMethod");
    }
}
