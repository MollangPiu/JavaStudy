package campus.ch08.question;

import java.util.Scanner;

class While_Que02 {

    /**
     * 구구단
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 9까지 입력해주세요.");
        int num = sc.nextInt();

        int cnt = 1;
        while(cnt <= 9) {
            System.out.println(num+" x "+cnt+" = "+(num*cnt));
            cnt++;
        }
    }
}
