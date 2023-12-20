package campus.ch01.pro02;

import java.util.Scanner;

class DataTypeScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요.");
        int num = sc.nextInt();

        System.out.println("num: "+num);
    }
}
