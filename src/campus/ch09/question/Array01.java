package campus.ch09.question;

import java.util.Scanner;

class Array01 {

    public static void main(String[] args) {

        /**
         * 반복문을 통해서 값을 받기
         */
        int cnt = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 수를 입력해주세요. ( 5 이하 )");
        cnt = sc.nextInt();

        int [] arr = new int[cnt];
        for(int i=0; i < cnt; i++) {
            System.out.println("입력할 숫자");
            arr[i] = sc.nextInt();
        }

        System.out.println("출력 값");
        for(int i=0; i < cnt; i++) {
            System.out.println(arr[i]);
        }
    }
}
