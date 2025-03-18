package campus.pro.기초문제;

import java.util.Scanner;

class 계산기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op = 0;
        do {
            System.out.println("기능을 선택해주세요. ");
            System.out.println("1: 더하기, 2: 빼기, 3: 곱하기, 4: 나누기, 0 종료");
            op = sc.nextInt();
            if(op == 0) {
                break;
            }

            System.out.println("첫 번째 수를 입력해 주세요.");
            int num1 = sc.nextInt();

            System.out.println("두 번째 수를 입력해 주세요.");
            int num2 = sc.nextInt();

            //크기 변경하기
            if(num1 < num2 ) {
                num1 = num1 ^ num2;
                num2 = num2 ^ num1;
                num1 = num1 ^ num2;
            }

            switch (op) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                default:
                    break;
            }

        } while (sc.hasNextInt());
    }
}
