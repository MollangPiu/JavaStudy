package campus.ch06.question;

import java.util.Scanner;

class Que04 {

    /**
     * 홀수, 짝수 만들기
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("수 하나를 입력해주세요.");

        int num = sc.nextInt();

        if(num%2 == 1) {
            System.out.println("홀수 입니다.");
        } else {
            System.out.println("짝수 입니다.");
        }

    }
}
