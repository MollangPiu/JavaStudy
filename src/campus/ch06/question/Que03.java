package campus.ch06.question;

import java.util.Scanner;

class Que03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 수 입력");
        int num1 = sc.nextInt();

        System.out.println("두 번째 수 입력");
        int num2 = sc.nextInt();

        System.out.println("기호 입력 ( +, -, *, /, % )");
        String check = sc.next();

        //항상 num1이 더 크도록
        if( num2 > num1 ) {
            // num1과 num2의 값 교환
            num1 = num1 ^ num2;
            num2 = num1 ^ num2;
            num1 = num1 ^ num2;
        }

        if(check.equals("+")) {
            System.out.println("두수의 합: "+(num1+num2));
        }
        else if(check.equals("*")) {
            System.out.println("두수의 곱: "+(num1*num2));
        }
        else if(check.equals("-")) {
            System.out.println("두수의 차: "+(num1-num2));
        }
        else if(check.equals("/")) {
            System.out.println("두수의 나누기: "+(num1/num2));
        }
        else if(check.equals("%")) {
            System.out.println("두수의 나머지: "+(num1%num2));
        }
        else {
            System.out.println("식별 할 수 없는 기호입니다.");
        }
    }
}
