package campus.ch07;

import java.util.Scanner;

class Switch02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요.");
        int num = sc.nextInt();

        switch (num%2) {
            case 0:
                System.out.println("짝수 입니다.");
                break;
            case 1:
                System.out.println("홀수 입니다.");
                break;
        }


    }
}
