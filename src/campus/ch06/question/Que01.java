package campus.ch06.question;

import java.util.Scanner;

class Que01 {


    /**
     * 두 수의 합을 입력 받고 결과 구하기
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 수 입력");
        int num1 = sc.nextInt();

        System.out.println("두 번째 수 입력");
        int num2 = sc.nextInt();




        if(num1 > num2) {
            System.out.println("첫 번째 수가 더 큽니다.");
        }
        else if(num1 < num2){
            System.out.println("두 번째 수가 더 큽니다.");
        }
        else {
            System.out.println("두 수의 값이 같습니다.");
        }


    }
}
