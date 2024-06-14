package campus.ch08.question;

import java.util.Scanner;


/**
 * 사용자가 멈출때까지 사칙연산 계산기 실행하기
 */
public class DoWhile_Que01 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int num = -1;
        do {


            System.out.println("첫 번째 수 입력");
            int num1 = scanner.nextInt();

            System.out.println("두 번째 수 입력");
            int num2 = scanner.nextInt();

            System.out.println("기호 입력 ( +, -, *, /, % )");
            String check = scanner.next();

            switch (check) {
                case "+":
                    System.out.println("두수의 합: "+(num1+num2));
                    break;
                case "-":
                    System.out.println("두수의 차: "+(num1-num2));
                    break;
                case "*":
                    System.out.println("두수의 곱: "+(num1*num2));
                    break;
                case "/":
                    System.out.println("두수의 나누기: "+(num1/num2));
                    break;
                case "%":
                    System.out.println("두수의 나머지: "+(num1%num2));
                    break;
                default:
                    System.out.println("식별 할 수 없는 기호입니다.");
                    break;
            }

            System.out.println("계속 진행하시겠습니까? 1: 예, 2: 아니오");
            num = scanner.nextInt();


        }
        while(num == 1);
    }
}
