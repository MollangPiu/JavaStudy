package campus.ch08.question;

import java.util.Scanner;

class For_Que01 {

    /**
     * 구구단
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 9까지 입력해주세요.");
        int num = sc.nextInt();



        for(int i = 1; i < 9; i++) {
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
