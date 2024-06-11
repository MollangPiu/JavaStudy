package campus.ch08.question;

import java.util.Scanner;

class While_Que01 {

    /**
     * 접은 갯수 구하기
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1 ~ 9 사이의 숫자를 입력해주세요.");
        int num = sc.nextInt();

        System.out.println("접은 횟수: "+num);
        int result = 1;
        while(num > 0) {
            result *=2;
            num--;
        }
        System.out.println("나타난 사각형 수: "+result);

    }
}
